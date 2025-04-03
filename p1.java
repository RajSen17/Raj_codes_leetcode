public class p1 {
        public static void main(String[] args){
            int a[]={1,2,3};
            for(int i=0;i<=1;i++){
                for(int j=0;j<a.length;j++) {
                    System.out.print(a[j]);
                    if(j!=2)
                    System.out.print(",");}
                if(i!=1)
                System.out.print(",");
                else
                    break;
                }}}

