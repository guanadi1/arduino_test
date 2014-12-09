package com.google.ads.b;

import com.google.ads.e.i;
import org.json.JSONException;
import org.json.JSONObject;

public class af
{
  private final String a;

  public af(String paramString)
  {
    this.a = paramString;
  }

  public JSONObject a()
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("debugHeader", this.a);
      return localJSONObject;
    }
    catch (JSONException localJSONException)
    {
      i.b("Could not build ReportAdJson from inputs.", localJSONException);
    }
    return localJSONObject;
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.google.ads.b.af
 * JD-Core Version:    0.6.2
 */