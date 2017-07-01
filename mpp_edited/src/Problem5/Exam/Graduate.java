package Problem5.Exam;

public interface Graduate 
{
	//You can change 
	int scholarships();
    default int feeCal(){
    	return getFee()*getCourse()+1000;
    }
    int getFee();
    int getCourse();
}
