package sg.edu.rp.c346.s19024292.ps_week01;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ActivityAdapter extends ArrayAdapter<Activity> {
    private ArrayList<Activity> types;
    private Context context;
    private TextView textView;

    public ActivityAdapter(Context context, int resource, ArrayList<Activity> types) {
        super(context, resource, types);
        this.types = types;
        this.context = context;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.types, parent,false);
        Activity currentType = types.get(position);

        textView = rowView.findViewById(R.id.tvtype);
        textView.setText(currentType.getType());

        return rowView;
    }
}
