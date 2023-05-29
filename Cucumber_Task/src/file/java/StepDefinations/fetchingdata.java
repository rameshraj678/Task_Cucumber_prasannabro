package StepDefinations;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class fetchingdata {

@Given("Lanuch the browswer")
public void lanuch_the_browswer() {
    System.out.println("open data browser");
}

@Then("body of the data")
public void body_of_the_data(DataTable dataTable) {

	List<List< String>>data=dataTable.asLists(String.class);
	for(List<String>ls:data) {
		System.out.println("tabale list"+ls);
	}
}
//	List<Map<String,String>>datamap=dataTable.asMaps(String.class, String.class);
//	System.out.println(datamap);
//	for(int i=0; i<datamap.size();i++) {
//		for(Map.Entry<String, String>data:datamap.get(i).entrySet()){
//		System.out.println(data.getKey()+" "+data.getValue());
//	}
//} 
//	System.out.println(datamap.get(0).get("FirstName"));
//}
@Then("asserting the data")
public void asserting_the_data() {
    
	System.out.println("fetching data is valid");
}

@Then("Sumitt the file")
public void sumitt_the_file() {

System.out.println("Submiting the data");
}


}
