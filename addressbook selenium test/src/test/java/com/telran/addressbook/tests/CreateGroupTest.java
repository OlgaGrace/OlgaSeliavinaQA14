package com.telran.addressbook.tests;

import com.telran.addressbook.model.GroupData;
import org.testng.Assert;
import org.testng.annotations.*;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CreateGroupTest extends TestBase {
  @DataProvider
  public Iterator<Object[]>validGroups() throws IOException {
    List<Object[]> list=new ArrayList<>();
      BufferedReader reader = new BufferedReader
              (new FileReader(new File("src/test/resources/groups.csv")));
      String line = reader.readLine();
      while (line!=null){
          String[] split = line.split(";");
          list.add(new Object[]{new GroupData().withName(split[0]).withHeader(split[1]).withFooter(split[2])});
      }
      return list.iterator();
  }
  @Test (dataProvider = "validGroups")
  public void testUntitledTestCase(GroupData group) throws Exception {
    app.getNavigationHelper().goToGroupPage();
    int before = app.getGroupHelper().getGroupCount();
    app.getGroupHelper().createNewGroup();
    app.getGroupHelper().fillGropuForm(new GroupData()
            .withName(group.getName())
            .withHeader(group.getHeader())
            .withFooter(group.getFooter()));
    app.getGroupHelper().submitGroupCreation();
    app.getGroupHelper().returnToGroupPage();
    int after = app.getGroupHelper().getGroupCount();
    System.out.println("passed 1");
    Assert.assertEquals(after, before+1);
  }

}
