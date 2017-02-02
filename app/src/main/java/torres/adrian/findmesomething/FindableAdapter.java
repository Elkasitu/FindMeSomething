package torres.adrian.findmesomething;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Adrian Torres on 02/02/2017.
 */

public class FindableAdapter extends RecyclerView.Adapter<FindableAdapter.ViewHolder>
{
	private String[] findableDataSet;

	// Holds all the views to be displayed per item
	public static class ViewHolder extends RecyclerView.ViewHolder
	{
		// Each item in the RecyclerView is composed of a TextView
		public TextView findableTView;
		public ViewHolder(TextView v)
		{
			super(v);
			findableTView = v;
		}
	}

	// Constructor
	public FindableAdapter(String[] dataset)
	{
		findableDataSet = dataset;
	}

	// Creation of views
	@Override
	public FindableAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
	{
		// The text view used per item
		TextView v = (TextView) LayoutInflater.from(parent.getContext()).inflate(
				R.layout.layout_text_findable, parent, false);
		ViewHolder vh = new ViewHolder(v);
		return vh;
	}

	@Override
	public void onBindViewHolder(ViewHolder holder, int position)
	{
		// We replace the item at index "position" in the view with the string at the same index
		// from the findableDataSet so that the data corresponds
		holder.findableTView.setText(findableDataSet[position]);
	}

	@Override
	public int getItemCount()
	{
		return findableDataSet.length;
	}

}
