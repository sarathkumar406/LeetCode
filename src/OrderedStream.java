class OrderedStream {

    private String[] stream;
    private int p;
    public OrderedStream(int n) {
        
        this.stream = new String[n+1];
        this.p = 1;
    }
    
    public List<String> insert(int idKey, String value) {
        
        stream[idKey] = value;
        List<String> al = new LinkedList<>();
       
        while(p < stream.length && stream[p]!=null){
            al.add(stream[p++]);
        }
        
        return al;
    }
}