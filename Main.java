//选择结构
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        判断奇偶性(if)
//        Scanner input = new Scanner(System.in);
//        System.out.println("请输入一个整数：");
//        int a=input.nextInt();
//        if(a%2==0){
//            System.out.println("你输入的数为偶数");
//        }else {
//            System.out.println("你输入的数为奇数");
//        }

//        偶数加10，奇数-10(if)
//        Scanner input = new Scanner(System.in);
//        System.out.println("请输入一个数：");
//        int x=input.nextInt();
//        if(x%2==0){
//            System.out.println(x+"是偶数，+10="+(x+10));
//        }else {
//            System.out.println(x+"是奇数，x-10="+(x-10));
//        }

//        判断闰年
//        Scanner input1= new Scanner(System.in);
//        System.out.println("请输入一个年份：");
//        int year=input1.nextInt();
//        if(year%400==0||(year%4==0&&year%100!=0)){
//            System.out.println(year+"是闰年");
//        }else {
//            System.out.println(year+"不是闰年");
//        }

//        三个数判断最大值(if)
//        Scanner input2=new Scanner(System.in);
//        System.out.println("q=");
//        int q=input2.nextInt();
//        System.out.println("w=");
//        int w=input2.nextInt();
//        System.out.println("e=");
//        int e=input2.nextInt();
//        int max;
//        if(q>w){
//            if (w>e){
//                max=w;
//            }else {
//                max=e;
//            }
//            System.out.println(max);
//        }else {
//            if(q>e){
//                max=q;
//            }else {
//                max=e;
//            }
//        }
//        System.out.println(max);

//        判断成绩等级(if)
//        Scanner input = new Scanner(System.in);
//        System.out.println("请输入你的成绩：");
//        int great=input.nextInt();
//        if(great>100||great<0){
//            System.out.println("erro");
//            return;
//        }
//        if(great>=90){
//            System.out.println("A");
//        } else if (great>=80) {
//            System.out.println("B");
//        }else if(great>=70){
//            System.out.println("C");
//        } else if (great>=60) {
//            System.out.println("D");
//        }else {
//            System.out.println("不及格");
//        }

//        输入月份——>季节(if else)
//        Scanner input1 =new Scanner(System.in);
//        System.out.println("请输入你想要的月份：");
//        int year=input1.nextInt();
//        if(year>=3&&year<=5){
//            System.out.println("春");
//        } else if (year>=6&&year<=8) {
//            System.out.println("夏");
//        }else if(year>=9&&year<=11){
//            System.out.println("秋");
//        } else if (year==12||year==1||year==2) {
//            System.out.println("冬");
//        }else {
//            System.out.println("输入错误");
//        }

//        switch:实现优良中差
//        Scanner input2 = new Scanner(System.in);
//        System.out.println("请输入你的成绩:");
//        int nexted = input2.nextInt();
//        int great=nexted/10;
//        switch (great){
//            case 10:
//            case 9:
//                System.out.println("优");
//                break;
//            case 8:
//                System.out.println("良");
//                break;
//            case 7:
//            case 6:
//                System.out.println("中");
//                break;
//            case 5:
//            case 4:
//            case 3:
//            case 2:
//            case 1:
//            case 0:
//                System.out.println("差");
//                break;
//            default:
//                System.out.println("输入的成绩不合格");
//                break;
//        }

//        swich:实现四则运算
//            Scanner input=new Scanner(System.in);
//            System.out.println("请输入第一个数字：");
//            double a=input.nextDouble();
//            System.out.println("符号：");
//            char yun=input.next().charAt(0);
//            System.out.println("请输入第二个数字：");
//            double b=input.nextDouble();
//        switch (yun) {
//            case '+':
//                System.out.println(a+b);
//                break;
//            case '-':
//                System.out.println(a-b);
//                break;
//            case '*':
//                System.out.println(a*b);
//                break;
//            case '/':
//                if(b!=0) {
//                    System.out.println(a/b);
//                }else {
//                    System.out.println("违反运算规则");
//                    break;
//                }
//            default:
//                System.out.println("输入错误");
//        }

//          计算BMI(if)
//        Scanner input4 = new Scanner(System.in);
//        System.out.println("请输入你的体重(kg)：");
//        double tz=input4.nextDouble();
//        System.out.println("请输入你的身高(米)：");
//        double sg=input4.nextDouble();
//        double bmi=tz/(sg*sg);
//        System.out.println("你的身体指数为："+bmi);
//        if(bmi<18.5){
//            System.out.println("你的体重偏瘦");
//        }else if(bmi<25.0){
//            System.out.println("你的体重正常");
//        } else if (bmi<30) {
//            System.out.println("你的体重超重");
//        }else {
//            System.out.println("你的体重过胖");
//        }

//        switch:输入月份，判断当天天数
//        Scanner input6= new Scanner(System.in);
//        System.out.println("请输入你查询的年份：");
//        int year=input6.nextInt();
//        System.out.println("请输入你查询的月份：");
//        int moth=input6.nextInt();
//        int day=switch (moth){
//            case 1,3,5,7,8,10,12->31;
//            case 4,6,9,11->30;
//            case 2->{
//                if ((year%4==0)&&!(year%100==0)||(year%400==0)){
//                    yield 29;
//                }else
//                    yield 28;
//            }
//            default -> 0;
//        };
//        System.out.println("该月的天数为："+day);

//              第二种
//                switch (moth) {
//                    case 1:
//                    case 3:
//                    case 5:
//                    case 7:
//                    case 8:
//                    case 10:
//                    case 12:
//                        System.out.println("31");
//                    case 4:
//                    case 6:
//                    case 9:
//                    case 11:
//                        System.out.println("30");
//                    case 2:
//                        System.out.println((year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) ? 29 : 28); //(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) ? 29 : 28;
//                    default:
//                        System.out.println("0");
//                }
            }
        }

