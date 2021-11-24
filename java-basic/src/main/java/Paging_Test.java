
public class Paging_Test {

  public static void main(String[] args) {
    int no = 3;
    int totalNum = 40;
    double calNum;

    if ((no % 3.0) == 0) {
      calNum = no/3.0;
    } else {
      calNum = Math.ceil(no/3.0);
    }


    int startNo = (int) ((3*calNum)-2);
    int endNo = (int) (3*(calNum)+1);
    int totalPageNo = ((int) Math.ceil(totalNum / 8) + 1);


    if (totalPageNo < endNo) {
      endNo = totalPageNo;
    }
    System.out.println(Math.ceil((no/3.0)));
    System.out.println(calNum);
    System.out.println("페이징 시작번호 ===>" + startNo);
    System.out.println("페이징 마지막번호 ===>" + endNo);

    if (startNo < 3) {
      System.out.println("previous 비활성화");
    }

    if (endNo != totalPageNo) {
      System.out.println(endNo % 3);
      if ((endNo % 3) == 0) {
        System.out.println("next 활성화");
      }
    }


  }

}
