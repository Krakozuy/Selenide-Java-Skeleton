package pagesBuilder;

import pages.*;

public class App {

    public GoogleSearchPage googleSearchPage;
    public GoogleSearchResultsPage googleSearchResultsPage;


    public App() {
        googleSearchPage = PageBuilder.buildGoogleSearchPage();
        googleSearchResultsPage = PageBuilder.buildGoogleSearchResultPage();
    }
}