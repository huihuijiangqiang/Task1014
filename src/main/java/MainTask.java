public class MainTask {
    H_SelectScore_Interface hs;

    public static void main(String[] args) {
        excel excel=new excel("D:\\github\\Task1014\\score.xlsx", "sheet2");
        String[][] str = excel.readExcelData();
        H_SelectScore_Interface_IMPL hs=new H_SelectScore_Interface_IMPL();
        System.out.println(hs.SelectScore_Name(str,"费先彬1"));
    }
}
