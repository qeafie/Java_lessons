public class Comments {
    String text;
    int rating;
    Comments parent;
    int countParents;
    public static final String STEP_COMMENT = "---";
    
    public Comments (String text){
        this.text = text;
    }
    
    public Comments (String text, int rating){
        this(text);
        this.rating = rating;
    }
    
    public Comments (String text, int rating, Comments parent){
        this(text,rating);
        this.parent = parent;
    }
    
    public int countParents(Comments tempComments){
        // if (tempComments.parent == null){
            
        // }
        // else{
        //     this.countParents++;
        //     System.out.println("родитель есть!");
        //     countParents(parent);
        // }
        
        if (tempComments.parent == null) return 0;
        
        while (tempComments.parent!=null){
            if (tempComments.parent.parent == null) return 1;
            System.out.println("test");
            
            tempComments = tempComments.parent;
        }
        return 1;
        
    }
  
    public String toString(){
        String tempStr = "(" + rating + ")" + " " + text;

//        if(this.parent == null){
//            return tempStr;
//        }
//        else{
//            this.countParents++;
//            countParents(this.parent);
//            String tempStep = "";
//            for(int i = 0; i < this.countParents; i++){
//                tempStep+=STEP_COMMENT;
//            }
//            return tempStep + tempStr;
//        }
        Comments tempParent = parent;
        int countStep;
        if (parent != null ){
            countStep = 1;
            tempParent = parent.parent;
            while (tempParent != null){
                countStep++;
                tempParent = tempParent.parent;
            }
        }
        else {
            countStep = 0;
        }
        String tempStep = "";
        for(;countStep>0;countStep--){
            tempStep += STEP_COMMENT;
        }
        return tempStep + tempStr;
    }
}
