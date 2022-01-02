
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName: TestBirthday
 * @Description: TODO
 * @Author: HLX
 * @date: 2021/4/23 17:50
 * @Version: V1.0
 */
public class count {
    public static void main(String[] args) {
        //1.当前系统时间
        Date now=new Date();
        //时间 ms
        long nowTime=now.getTime();
//        System.out.println(nowTime);

        //2.出生日 -字符串
        String bir="2021-12-18";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        //3.字符串-返回日期
        try {
            Date birDate= sdf.parse(bir);
            //时间  ms
            long birTime=birDate.getTime();
//            System.out.println(birTime);

            //日期相减
            long time =birTime - nowTime;
            //判断
            if(time<0){
                System.out.println("no!");
            }else{
                //1000 s  60 分  60秒  24小时
                if (time>(1000*60*60*24*7)){
                    System.out.println(time/1000/60/60/24/7+"周!");
                }else if(time>(1000*60*60*24)){
                    System.out.println(time/1000/60/60/24+"天!");
                }

            }

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}