import org.junit.Test;

public class TestSelectScore {
    @Test
    public void test_01(){
        H_SelectScore_Interface h=new H_SelectScore_Interface_IMPL();
        //真实数据
//        excel excel=new excel("D:\\Task1014\\score.xlsx", "sheet2");
//        String[][] str = excel.readExcelData();
        String [][] str=new String[][]{
                {"学号","姓名","语文成绩","数学成绩","英语成绩"},
                {"100001","学生1","50","60","70"},
                {"100002","学生2","60","66","7"},
                {"100003","学生3","50","60","80"},
                {"100004","学生4","50","40","70"},
                {"100005","学生5","50","30","70"}};
        System.out.println(h.SelectScore_Name(str,"学生1"));
        System.out.println(h.SelectScore_xh(str,"100003"));
    }
}
