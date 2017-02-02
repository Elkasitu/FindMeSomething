package torres.adrian.findmesomething;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity
{
	private String[] findablesArray = {"Restaurants", "Banks/ATMs", "Night Shops",
									   "Night Clubs", "Parks", "Parkings", "Public Transport"};

	private ListView findableListView;
	private ArrayAdapter arrayAdapter;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		findableListView = (ListView) findViewById(R.id.findableList);

		arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, findablesArray);
		findableListView.setAdapter(arrayAdapter);
	}
}
