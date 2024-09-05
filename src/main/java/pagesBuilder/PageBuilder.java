package pagesBuilder;

import pages.*;

public class PageBuilder {
    public static GoogleSearchPage buildGoogleSearchPage() { return new GoogleSearchPage(""); }
    public static GoogleSearchResultsPage buildGoogleSearchResultPage() { return new GoogleSearchResultsPage(""); }
}
