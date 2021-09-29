public class RecordBook {
    long numberOfRecordBook;
    Name name;
    RecordResult[] results;

    RecordBook(long numberOfRecordBook){
        this.numberOfRecordBook = numberOfRecordBook;
    }
    RecordBook(long numberOfRecordBook, Name name){
        this(numberOfRecordBook);
        this.name = name;
    }

    RecordBook(long numberOfRecordBook, Name name,RecordResult...results){
        this(numberOfRecordBook,name);
        this.results = results;
    }

    @Override
    public String toString(){
        String tempStr = name.toString()+ "№ " + numberOfRecordBook+ ":\n" ;
        for(RecordResult result : results){
            tempStr+= "\t" + result.toString()+ "\n";
        }
        return tempStr;
    }
}
