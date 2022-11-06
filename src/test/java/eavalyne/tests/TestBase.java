package eavalyne.tests;

import eavalyne.pages.Common;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class TestBase {
    @BeforeMethod
    public void setUp(){Common.setUpDriver();}
}
