package TestData;

public enum SearchData {
    SEARCH_DATA ("case for iphone 11");

    private String searchdata;


    private SearchData(String searchdata) {
        this.searchdata = searchdata;
    }
    public String getSearchdata() {
        return searchdata;
    }

}