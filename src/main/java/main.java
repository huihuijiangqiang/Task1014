public class main {
    public static void main(String[] args) {
        W_ScoreManage_Interface w =new W_ScoreManage_Interface_IMPL();
        H_SelectScore_Interface h=new H_SelectScore_Interface_IMPL();
        excel excel=new excel("D:\\github\\Task1014\\score.xlsx", "sheet2");
        String[][] str = excel.readExcelData();
        System.out.println(w.average_score(str,"物理成绩"));
        System.out.println(w.max_score(str,"物理成绩"));
        System.out.println(h.SelectScore_Name(str,"费先彬1"));
        System.out.println(h.SelectScore_xh(str,"100001.0"));

    }
}
