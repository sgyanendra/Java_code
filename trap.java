class trap{

    public static int trapnum(int num[]){
        int n=num.length;
        int res=0,l=0,r=n-1;
        int lmax=num[l],rmax=num[r];

        while(l<r){
           if(lmax<rmax){
             l++;
             lmax=Math.max(lmax,num[l]);
             res+=lmax-num[l];
           }
           else{
            r--;
            rmax=Math.max(rmax,num[r]);
            res+=rmax-num[r];
           }
        }
    return res;
    }
    public static void main(String rag[]){
        int num[]={2,1,4,6,3};
        int c=trapnum(num);
        System.out.println(c);
    }
}