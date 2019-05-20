import java.util.Arrays;
import java.util.List;
import ac.il.afeka.Submission.Submission;
import ac.il.afeka.fsm.DFSM;
import ac.il.afeka.fsm.NDFSM;

// אילון מזרחי 206125411
// דניאל איבקוביץ' 316421262

public class NDFSM2DFSM implements Assignment3, Submission
{
	public static void main(String[] args)
	{

		String encoding = "0 1 2 3 4 5/0 1/0,,1;0,1,0;0,1,3;1,,3;1,0,2;2,1,5;3,0,4;4,,5;4,,2;4,1,1;5,0,4/0/2 4 5";

		try
		{
			NDFSM2DFSM m = new NDFSM2DFSM();
			DFSM dfsm = new DFSM(m.convert(encoding));
			System.out.println(dfsm.compute("1001010101"));
			System.out.println(dfsm.compute("100101010"));
			System.out.println(dfsm.compute("011"));
			System.out.println(dfsm.compute("1111"));
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}

	}

	@Override
	public String convert(String ndfsm_encoding) throws Exception
	{
		return new NDFSM(ndfsm_encoding).toDFSM().encode();
	}

	@Override
	public List<String> submittingStudentIds() 
	{
		return Arrays.asList("206125411", "316421262");
	}
}
