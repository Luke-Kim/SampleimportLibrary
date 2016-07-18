package com.begentgroup.xmlparser;

import java.util.HashMap;

class DataUnit {
	String elementName;
	Object mObject;
	ClassInfoTable tables;
	Class clazz;
	int level;
	FieldInfo defaultNameField;
	HashMap<String,ArrayData> arrayData = new HashMap<String,ArrayData>();
}
