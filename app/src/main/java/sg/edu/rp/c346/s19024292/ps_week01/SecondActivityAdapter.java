package sg.edu.rp.c346.s19024292.ps_week01;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SecondAdapter extends ArrayAdapter<Second> {

    private ArrayList<Second> holiday;
    private Context context;
    private ImageView imageView;
    private TextView textView;

    public SecondAdapter(SecondActivity context, int resource, ArrayList<Second> objects) {
        super(context, resource, objects);
        this.holiday = objects;
        this.context = context;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.row, parent, false);

        Second currentSecond = holiday.get(position);

        imageView = rowView.findViewById(R.id.ivholiday);
        textView = rowView.findViewById(R.id.tvholidayname);

        imageView.setImageResource(currentSecond.getHolidayImage());
        textView.setText(currentSecond.getHoliday());

        return rowView;
    }
}
