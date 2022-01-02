import java.util.Random;

public class for_meal {
    public static void main(String[] args) {
        int a,yes=0,no=0;
        int str = 0;
        Random ran = new Random();
        for (int i =0 ;i<1000;i++){
            a = ran.nextInt(2) + 1;
            if (a/2==1){
                yes+=1;
            }else {
                no+=1;
            }
        }
        if(yes>no){
            System.out.println("食堂");
        }else {
            str=1;
        }
        yes=0;
        no = 0;
        if (str==1){
            for (int i =0 ;i<1000;i++){
                a = ran.nextInt(2) + 1;
                if (a/2==1){
                    yes+=1;
                }else {
                    no+=1;
                }
            }
            if(yes>no){
                System.out.println("外面");
            }else {
                System.out.println("超市");;
            }
        }
//        System.out.println(str);
    }
}
