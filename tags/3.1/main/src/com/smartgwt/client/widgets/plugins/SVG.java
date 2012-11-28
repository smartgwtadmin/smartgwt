/*
 * Smart GWT (GWT for SmartClient)
 * Copyright 2008 and beyond, Isomorphic Software, Inc.
 *
 * Smart GWT is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License version 3
 * as published by the Free Software Foundation.  Smart GWT is also
 * available under typical commercial license terms - see
 * http://smartclient.com/license
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 */
 
package com.smartgwt.client.widgets.plugins;



import com.smartgwt.client.event.*;
import com.smartgwt.client.core.*;
import com.smartgwt.client.types.*;
import com.smartgwt.client.data.*;
import com.smartgwt.client.data.events.*;
import com.smartgwt.client.rpc.*;
import com.smartgwt.client.widgets.*;
import com.smartgwt.client.widgets.events.*;
import com.smartgwt.client.widgets.form.*;
import com.smartgwt.client.widgets.form.validator.*;
import com.smartgwt.client.widgets.form.fields.*;
import com.smartgwt.client.widgets.tile.*;
import com.smartgwt.client.widgets.tile.events.*;
import com.smartgwt.client.widgets.grid.*;
import com.smartgwt.client.widgets.grid.events.*;
import com.smartgwt.client.widgets.chart.*;
import com.smartgwt.client.widgets.layout.*;
import com.smartgwt.client.widgets.layout.events.*;
import com.smartgwt.client.widgets.menu.*;
import com.smartgwt.client.widgets.tab.*;
import com.smartgwt.client.widgets.toolbar.*;
import com.smartgwt.client.widgets.tree.*;
import com.smartgwt.client.widgets.tree.events.*;
import com.smartgwt.client.widgets.viewer.*;
import com.smartgwt.client.widgets.calendar.*;
import com.smartgwt.client.widgets.calendar.events.*;
import com.smartgwt.client.widgets.cube.*;
import com.smartgwt.client.widgets.drawing.*;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;

import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.Element;
import com.smartgwt.client.util.*;
import com.smartgwt.client.util.workflow.*;
import com.google.gwt.event.shared.*;
import com.google.gwt.event.shared.HasHandlers;
import com.smartgwt.logicalstructure.core.*;
import com.smartgwt.logicalstructure.widgets.*;
import com.smartgwt.logicalstructure.widgets.drawing.*;
import com.smartgwt.logicalstructure.widgets.plugins.*;
import com.smartgwt.logicalstructure.widgets.form.*;
import com.smartgwt.logicalstructure.widgets.tile.*;
import com.smartgwt.logicalstructure.widgets.grid.*;
import com.smartgwt.logicalstructure.widgets.chart.*;
import com.smartgwt.logicalstructure.widgets.layout.*;
import com.smartgwt.logicalstructure.widgets.menu.*;
import com.smartgwt.logicalstructure.widgets.tab.*;
import com.smartgwt.logicalstructure.widgets.tableview.*;
import com.smartgwt.logicalstructure.widgets.toolbar.*;
import com.smartgwt.logicalstructure.widgets.tree.*;
import com.smartgwt.logicalstructure.widgets.viewer.*;
import com.smartgwt.logicalstructure.widgets.calendar.*;
import com.smartgwt.logicalstructure.widgets.cube.*;

/**
 * ISC Abstraction for SVG controls
 */
public class SVG extends BrowserPlugin {

    public native static SVG getOrCreateRef(JavaScriptObject jsObj) /*-{

    	if(jsObj == null) return null;
    	
    	var instance = jsObj["__ref"];
    	
    	if(instance==undefined) {
            return @com.smartgwt.client.util.ObjectFactory::createCanvas(Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)("SVG",jsObj);
        } else if(instance != null) {
            return instance;
        //} else {
        //    return @com.smartgwt.client.widgets.plugins.SVG::new(Lcom/google/gwt/core/client/JavaScriptObject;)(jsObj);
        }
    }-*/;

    public void setJavaScriptObject(JavaScriptObject jsObj) {
        id = JSOHelper.getAttribute(jsObj, "ID");
    }


    public SVG(){
        scClassName = "SVG";
    }

    public SVG(JavaScriptObject jsObj){
        scClassName = "SVG";
        setJavaScriptObject(jsObj);
    }

    protected native JavaScriptObject create()/*-{
        var config = this.@com.smartgwt.client.widgets.BaseWidget::getConfig()();
        var scClassName = this.@com.smartgwt.client.widgets.BaseWidget::scClassName;
        var widget = $wnd.isc[scClassName].create(config);
        this.@com.smartgwt.client.widgets.BaseWidget::doInit()();
        return widget;
    }-*/;
    // ********************* Properties / Attributes ***********************

    /**
     * This attribute specifies the page the user should go to to get the plugin required to view  this SVG.  <p>  The default
     * pluginsPage is: "http://www.adobe.com/svg/viewer/install/"  <p>
     *
     * @param pluginsPage . See {@link com.smartgwt.client.docs.String String}. Default value is see below
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setPluginsPage(String pluginsPage)  throws IllegalStateException {
        setAttribute("pluginsPage", pluginsPage, false);
    }

    /**
     * This attribute specifies the page the user should go to to get the plugin required to view  this SVG.  <p>  The default
     * pluginsPage is: "http://www.adobe.com/svg/viewer/install/"  <p>
     *
     *
     * @return . See {@link com.smartgwt.client.docs.String String}
     */
    public String getPluginsPage()  {
        return getAttributeAsString("pluginsPage");
    }

    /**
     * Location from which to load the SVG.  <p>  Note: if you do not specify a src value, ISC will load the special svg
     * 'svgCanvas.svg' from  the helpers directory.  This SVG is simply an empty root element - essentially a blank  canvas. 
     * You can use this feature to write components that programmatically manipulate the  SVG DOM without needing to ship
     * placeholder SVG files.  <p>
     *
     * @param src . See {@link com.smartgwt.client.docs.String String}. Default value is [HELPERS]svgCanvas.svg
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setSrc(String src)  throws IllegalStateException {
        setAttribute("src", src, false);
    }

    /**
     * Location from which to load the SVG.  <p>  Note: if you do not specify a src value, ISC will load the special svg
     * 'svgCanvas.svg' from  the helpers directory.  This SVG is simply an empty root element - essentially a blank  canvas. 
     * You can use this feature to write components that programmatically manipulate the  SVG DOM without needing to ship
     * placeholder SVG files.  <p>
     *
     *
     * @return . See {@link com.smartgwt.client.docs.String String}
     */
    public String getSrc()  {
        return getAttributeAsString("src");
    }

    // ********************* Methods ***********************

    // ********************* Static Methods ***********************
    /**
     * Class level method to set the default properties of this class. If set, then all subsequent instances of this
     * class will automatically have the default properties that were set when this method was called. This is a powerful
     * feature that eliminates the need for users to create a separate hierarchy of subclasses that only alter the default
     * properties of this class. Can also be used for skinning / styling purposes.
     * <P>
     * <b>Note:</b> This method is intended for setting default attributes only and will effect all instances of the
     * underlying class (including those automatically generated in JavaScript). 
     * This method should not be used to apply standard EventHandlers or override methods for
     * a class - use a custom subclass instead.
     *
     * @param sVGProperties properties that should be used as new defaults when instances of this class are created
     */
    public static native void setDefaultProperties(SVG sVGProperties) /*-{
    	var properties = $wnd.isc.addProperties({},sVGProperties.@com.smartgwt.client.widgets.BaseWidget::getConfig()());
    	delete properties.ID;
        $wnd.isc.SVG.addProperties(properties);
    }-*/;
        
    // ***********************************************************        

    public LogicalStructureObject setLogicalStructure(SVGLogicalStructure s) {
        super.setLogicalStructure(s);
        try {
            s.pluginsPage = getAttributeAsString("pluginsPage");
        } catch (Throwable t) {
            s.logicalStructureErrors += "SVG.pluginsPage:" + t.getMessage() + "\n";
        }
        try {
            s.src = getAttributeAsString("src");
        } catch (Throwable t) {
            s.logicalStructureErrors += "SVG.src:" + t.getMessage() + "\n";
        }
        return s;
    }
    
    public LogicalStructureObject getLogicalStructure() {
        SVGLogicalStructure s = new SVGLogicalStructure();
        setLogicalStructure(s);
        return s;
    }
}

