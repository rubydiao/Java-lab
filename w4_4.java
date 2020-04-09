package w4;

class SortMergeList{
    public void intersect(int[] list1,int[] list2){
        for(int i = 0;i < list1.length;i++){
            for(int j = 0;j < list2.length;j++){
                if(list1[i] == list2[j]){
                    System.out.format("%s ", list1[i]);
                    break;
                }
            }
        }
        System.out.println();
    }
}

public class w4_4 {
    public static void main(String[] args) {
        SortMergeList rol = new SortMergeList();
        int list1 [] = {1 ,4 ,8 ,9 ,11 ,15 ,17 ,28 ,41 ,59};
        int list2 [] = {4 ,7 ,11 ,17 ,19 ,20 ,23 ,28 ,37 ,59 ,81};
        rol.intersect(list1, list2);
    }
    
}
