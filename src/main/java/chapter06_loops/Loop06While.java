package chapter06_loops;
/*
        while내에 있는 조건식이 true일때 {}내의 영역이 반복
         */
public class Loop06While {
    public static void main(String[] args) {
//        int n =1;
//        while(n<101){
//            System.out.println(n);
//            n++;  }  //해당 코드가 없으면 무한 루프에 빠지게됨
            /*
                그래서 for 문을 쓸 때와 달리 while문을 작성할때의 유의할 점으로는:
                for문은 한계값을 작성하지만
                while문은 그렇지 않다
                특정 조건에서 false가 되게끔 고려해 적어야한다
             */
            int sum1 = 0;
            int sum2 =0;
            int j = 0;
            int n =0;
            for(int i =0; i<5; i++ ){
                sum1 += i+1 ;
            }
            while(j != 6){
                sum2 += j;
                j++;
            }
            System.out.println("for문을 통한 합:" + sum1);
            System.out.println("while문을 통한 합:" + sum2);

            while(n<6){
                sum2 += n;
                n++;
            }

            System.out.println("while문을 통한 합:" + sum2);

            /*

             */
        //반복이 100번
        for(int i =1; i <101; i++){
            System.out.print((i)+" ");
            if (i % 10 == 0){
                System.out.println();
            }
        }
        //반복이 10번 이뤄짐
        for(int i =1; i <101; i = i+10) {
            System.out.println("" + i + (i + 1) + (i + 2));//10이 모두 한 번에 찍히게  하는 방법
        }
        System.out.println("--while--");
        int a = 0 ;
        while ( a< 100){
            a++;
            System.out.print(a + " ");
            if(a %10 ==0){
                System.out.println();
            }
        }


    }
}
