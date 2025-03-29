class greater
{
    public static void main(String[] args)
    {
        int[][] marks={{10,12,11},{23,67,8},{33,44,55},{78,4,3},{23,78,99}};
        int mark1 = 0,mark2= 0,mark3 =0;
        for(int j=0;j<marks.length;j++)
        {
            if(mark1<marks[j][0])
            {
                mark1 = marks[j][0];
            }
            if(mark2 <marks[j][1])
            {
                mark2 = marks[j][1];
            }
            if(mark3<marks[j][2])
            {
                mark3 = marks[j][2];
            }
        }
        System.out.println(mark1);
        System.out.println(mark2);
        System.out.println(mark3);
    }
}