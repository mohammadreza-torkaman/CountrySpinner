package com.mrtr.cspinner.core;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.mrtr.cspinner.R;
import com.mrtr.cspinner.helper.Country;
import com.mrtr.cspinner.helper.model.SpinnerItem;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class CountrySpinnerAdapter extends ArrayAdapter<String> {

  @NonNull
  private final Context context;
  private SpinnerItem[] items = Country.getDefaultSpinnerItems();


  public CountrySpinnerAdapter(@NonNull Context context, SpinnerItem[] items) {
    super(context, R.layout.spinner_item);
    this.context = context;
    this.items = items;
  }

  public CountrySpinnerAdapter(@NonNull Context context, SpinnerItem[] items, int layout) {
    super(context, layout);
    this.context = context;
    this.items = items;
  }

  public CountrySpinnerAdapter(@NonNull Context context) {
    super(context, R.layout.spinner_item);
    this.context = context;
  }

  public CountrySpinnerAdapter(@NonNull Context context, int layout) {
    super(context, layout);
    this.context = context;

  }

  @Override
  public int getCount() {
    return items.length;
  }

  @NonNull
  @Override
  public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

    ViewHolder viewHolder = new ViewHolder();

    if (convertView == null) {
      LayoutInflater mInflater = (LayoutInflater) context.
        getSystemService(Context.LAYOUT_INFLATER_SERVICE);
      convertView = mInflater.inflate(R.layout.spinner_item, parent, false);
      viewHolder.countryFlag = convertView.findViewById(R.id.country_flag);
      viewHolder.countryName = convertView.findViewById(R.id.country_name);
      viewHolder.countryCode = convertView.findViewById(R.id.country_code);
      convertView.setTag(viewHolder);
    } else {
      viewHolder = (ViewHolder) convertView.getTag();
    }
    SpinnerItem item = items[position];
    if (item != null) {
      viewHolder.countryFlag.setImageResource(item.getFlag());
      viewHolder.countryName.setText(item.getCountryName());
      viewHolder.countryCode.setText(item.getCountryCode());
    }

    return convertView;

  }

  @Override
  public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
    return getView(position, convertView, parent);
  }

  private static class ViewHolder {
    ImageView countryFlag;
    TextView countryName;
    TextView countryCode;
  }

}
