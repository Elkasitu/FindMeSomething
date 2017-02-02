package torres.adrian.findmesomething;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends Activity
{
	private String[] findablesArray = {"Restaurants", "Banks/ATMs", "Night Shops",
									   "Night Clubs", "Parks", "Parkings", "Public Transport"};

	private RecyclerView findableView;
	private RecyclerView.Adapter findableAdapter;
	private RecyclerView.LayoutManager findableLayoutManager;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		findableView = (RecyclerView) findViewById(R.id.findables_list);

		// Content of RecyclerView is static
		findableView.setHasFixedSize(true);

		// Use a linear layout manager
		findableLayoutManager = new LinearLayoutManager(this);
		findableView.setLayoutManager(findableLayoutManager);

		// Add a data-set to the adapter, and attach the adapter to the RecyclerView for display
		findableAdapter = new FindableAdapter(findablesArray);
		findableView.setAdapter(findableAdapter);


	}
}
