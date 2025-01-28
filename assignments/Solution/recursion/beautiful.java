public class beautiful {
        public static int countArrangement(int n) {
            Boolean[] bool = new Boolean[n];
            Integer[] num = new Integer[n];
            for(int i = 0; i<n; i++){
                num[i] = i+1;
                bool[i] = false;
            }
            return f(n,bool,num,1);
        }
        public static int f(int n,Boolean[] bool,Integer[] num,int index){
            if(index > n){
                return 1;
            }
            int total = 0;
            for(int i = 1; i<=n; i++){
                if(bool[i-1] != true && (num[i-1] % index == 0 || index%num[i-1] == 0)){
                    bool[i-1] = true;
                    total += f(n,bool,num,index+1);
                    bool[i-1] = false;
                }
            }
            return total;
        }
    public static void main(String[] args) {
        System.out.println(beautiful.countArrangement(2));
    }
    
}
