import org.junit.Assert;
import org.junit.Test;
import org.junit.Assert.*;
public class TestScoreManage {
    //
    //
    
    @Test
    public void Test_01(){
        //真实数据
//        excel excel=new excel("D:\github\Task1014\score.xlsx", "sheet2");
//        String[][] str = excel.readExcelData();
        //虚假学生数据
        String [][] str=new String[][]{
                {"学号","姓名","语文成绩","数学成绩","英语成绩"},
                {"100001","学生1","50","60","70"},
                {"100002","学生2","60","66","7"},
                {"100003","学生3","30","60","80"},
                {"100004","学生4","20","40","70"},
                {"100005","学生5","15","30","70"}};
        W_ScoreManage_Interface w=new W_ScoreManage_Interface_IMPL();
        double arrays = w.max_score(str, "语文成绩");
        Assert.assertEquals(arrays,60,0);
        Assert.assertEquals(w.average_score(str,"语文成绩"),35,0);
    }
}
