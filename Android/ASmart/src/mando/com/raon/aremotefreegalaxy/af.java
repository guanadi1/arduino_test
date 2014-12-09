package com.raon.aremotefreegalaxy;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import com.raon.remotelib.d;

class af
  implements AdapterView.OnItemClickListener
{
  af(SelectBrandActivity paramSelectBrandActivity, int paramInt)
  {
  }

  public void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    d locald = (d)this.b.b.getItemAtPosition(paramInt);
    Intent localIntent = new Intent(this.b, SelectModelActivity.class);
    localIntent.putExtra("bid", locald.a);
    localIntent.putExtra("categoryid", this.a);
    this.b.startActivityForResult(localIntent, 0);
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.raon.aremotefreegalaxy.af
 * JD-Core Version:    0.6.2
 */