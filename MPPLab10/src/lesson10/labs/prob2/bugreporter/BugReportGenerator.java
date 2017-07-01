package lesson10.labs.prob2.bugreporter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

import lesson10.labs.prob2.classfinder.ClassFinder;

/**
 * This class scans the package lesson10.labs.prob2.javapackage for classes with
 * annotation @BugReport. It then generates a bug report bugreport.txt,
 * formatted like this:
 *
 * Joe Smith reportedBy: classname: description: severity:
 *
 * reportedBy: classname: description: severity:
 *
 * Tom Jones reportedBy: classname: description: severity:
 *
 * reportedBy: classname: description: severity:
 *
 *
 */
public class BugReportGenerator {
	private static final Logger LOG = Logger.getLogger(BugReportGenerator.class.getName());
	private static final String PACKAGE_TO_SCAN = "lesson10.labs.prob2.javapackage";
	private static final String REPORT_NAME = "bug_report.txt";
	private static final String REPORTED_BY = "reportedBy: ";
	private static final String CLASS_NAME = "classname: ";
	private static final String DESCRIPTION = "description: ";
	private static final String SEVERITY = "severity: ";

	public void reportGenerator() {
		List<Class<?>> classes = ClassFinder.find(PACKAGE_TO_SCAN);

		// implement
		StringBuilder sb = new StringBuilder();
		for (Class<?> clazz : classes) {
			if (clazz.isAnnotationPresent(BugReport.class)) {
				BugReport annotation = (BugReport) clazz.getAnnotation(BugReport.class);
				if (annotation != null) {
					sb.append(annotation.assignedTo()).append("\n");
					sb.append(REPORTED_BY).append(annotation.reportedBy()).append("\n");
					sb.append(CLASS_NAME).append(annotation).append("\n");
					sb.append(DESCRIPTION).append(annotation.description()).append("\n");
					sb.append(SEVERITY).append(annotation.severity()).append("\n");
				}
			}
		}

		System.out.println(sb.toString());

		try {
			File file = new File("bug_report.txt");
			if (!file.exists()) {
				file.createNewFile();
			}
	
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(sb.toString());
			bw.close();
	    } catch (IOException e) {
	        e.printStackTrace();
	    }			
	}
}
