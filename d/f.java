package d;

import Client.A;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public final class f
{
  private int a;
  
  public f(int paramInt)
  {
    this.a = paramInt;
  }
  
  public f(String paramString)
  {
    paramString = (paramString = (paramString = A.b(paramString)).getDocumentElement()).getChildNodes();
    for (int i = 0; i < paramString.getLength(); i++)
    {
      Element localElement;
      if ((!(localElement = (Element)paramString.item(i)).getNodeName().equals("PacketType")) && (localElement.getNodeName().equals("Win"))) {
        this.a = Integer.parseInt(localElement.getTextContent());
      }
    }
  }
  
  public final String toString()
  {
    String str;
    return str = "<Packet><PacketType>GameOver" + "</PacketType><Win>" + this.a + "</Win></Packet>";
  }
}


/* Location:              C:\Program Files (x86)\FeedLess-Alpha\Client.jar!\d\f.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */