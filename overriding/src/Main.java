public class Main {
    public static void main(String[] args) {
        BaseCreditManager[] creditManager = new BaseCreditManager[]{new TeacherCreditManager(),new FarmCreditManager(),new StudentCreditManager()};
        for(BaseCreditManager creditManagers : creditManager){
            System.out.println(creditManagers.calculate(100000));
        }
    }
}