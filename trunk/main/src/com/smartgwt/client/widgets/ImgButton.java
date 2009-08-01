/*
 * SmartGWT (GWT for SmartClient)
 * Copyright 2008 and beyond, Isomorphic Software, Inc.
 *
 * SmartGWT is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License version 3
 * as published by the Free Software Foundation.  SmartGWT is also
 * available under typical commercial license terms - see
 * http://smartclient.com/license
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 */
 
package com.smartgwt.client.widgets;



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
import com.smartgwt.client.widgets.layout.*;
import com.smartgwt.client.widgets.menu.*;
import com.smartgwt.client.widgets.tab.*;
import com.smartgwt.client.widgets.toolbar.*;
import com.smartgwt.client.widgets.tree.*;
import com.smartgwt.client.widgets.tree.events.*;
import com.smartgwt.client.widgets.viewer.*;
import com.smartgwt.client.widgets.calendar.*;
import com.smartgwt.client.widgets.calendar.events.*;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.Element;
import com.smartgwt.client.util.JSOHelper;
import com.smartgwt.client.util.EnumUtil;
import com.google.gwt.event.shared.*;
import com.google.gwt.event.shared.HasHandlers;
   /**
    * A Img that behaves like a button, going through up/down/over state transitions in response to&#010 user events.  Supports an optional title, and will auto-size to accomodate the title text if&#010 <code>overflow</code> is set to "visible".&#010 <P>&#010 An examples of use is Window minimize/close buttons.

    */
public class ImgButton extends Img {

    public static ImgButton getOrCreateRef(JavaScriptObject jsObj) {
        if(jsObj == null) return null;
        BaseWidget obj = BaseWidget.getRef(jsObj);
        if(obj != null) {
            return (ImgButton) obj;
        } else {
            return new ImgButton(jsObj);
        }
    }


    public ImgButton(){
        
    }

    public ImgButton(JavaScriptObject jsObj){
        super(jsObj);
    }

    protected native JavaScriptObject create()/*-{
        var config = this.@com.smartgwt.client.widgets.BaseWidget::getConfig()();
        var widget = $wnd.isc.ImgButton.create(config);
        this.@com.smartgwt.client.widgets.BaseWidget::doInit()();
        return widget;
    }-*/;
    // ********************* Properties / Attributes ***********************

    /**
    * The text title to display in this button.
    * Set the title.&#010
    *
    * @param title new title. Default value is varies
    */
    public void setTitle(String title) {
        setAttribute("title", title, true);
    }
    /**
     * The text title to display in this button.
     *
     *
     * @return Return the title - text/HTML drawn inside the component.&#010 <p>&#010 Default is to simply return this.title.&#010
     *
     */
    public String getTitle()  {
        return getAttributeAsString("title");
    }

    /**
    * If set to true, if the {@link com.smartgwt.client.widgets.StatefulCanvas#getTitle 'title'} of this button contains the&#010 specified {@link com.smartgwt.client.widgets.Canvas#getAccessKey 'accessKey'}, when the title is displayed to the user&#010 it will be modified to include HTML to underline the accessKey.<br>&#010 Note that this property may cause titles that include HTML (rather than simple strings)&#010 to be inappropriately modified, so should be disabled if your title string includes&#010 HTML characters.
    *
    * @param hiliteAccessKey hiliteAccessKey Default value is null
    */
    public void setHiliteAccessKey(Boolean hiliteAccessKey) {
        setAttribute("hiliteAccessKey", hiliteAccessKey, true);
    }
    /**
     * If set to true, if the {@link com.smartgwt.client.widgets.StatefulCanvas#getTitle 'title'} of this button contains the&#010 specified {@link com.smartgwt.client.widgets.Canvas#getAccessKey 'accessKey'}, when the title is displayed to the user&#010 it will be modified to include HTML to underline the accessKey.<br>&#010 Note that this property may cause titles that include HTML (rather than simple strings)&#010 to be inappropriately modified, so should be disabled if your title string includes&#010 HTML characters.
     *
     *
     * @return Boolean
     *
     */
    public Boolean getHiliteAccessKey()  {
        return getAttributeAsBoolean("hiliteAccessKey");
    }

    /**
    * Optional icon to be shown with the button title text.  &#010 <P>&#010 Specify as the partial URL to an image, relative to the imgDir of this component.
    * Change the icon being shown next to the title text.&#010
    *
    * @param icon URL of new icon. Default value is null
    */
    public void setIcon(String icon) {
        setAttribute("icon", icon, true);
    }
    /**
     * Optional icon to be shown with the button title text.  &#010 <P>&#010 Specify as the partial URL to an image, relative to the imgDir of this component.
     *
     *
     * @return String
     *
     */
    public String getIcon()  {
        return getAttributeAsString("icon");
    }

    /**
    * Size in pixels of the icon image.&#010 <P>&#010 The <code>iconWidth</code> and <code>iconHeight</code> properties can be used to&#010 configure width and height separately.
    *
    * @param iconSize iconSize Default value is 16
    * @throws IllegalStateException this property cannot be changed after the component has been created
    */
    public void setIconSize(int iconSize)  throws IllegalStateException {
        setAttribute("iconSize", iconSize, false);
    }
    /**
     * Size in pixels of the icon image.&#010 <P>&#010 The <code>iconWidth</code> and <code>iconHeight</code> properties can be used to&#010 configure width and height separately.
     *
     *
     * @return int
     *
     */
    public int getIconSize()  {
        return getAttributeAsInt("iconSize");
    }

    /**
    * Width in pixels of the icon image.&#010 <P>&#010 If unset, defaults to <code>iconSize</code>
    *
    * @param iconWidth iconWidth Default value is null
    * @throws IllegalStateException this property cannot be changed after the component has been created
    */
    public void setIconWidth(Integer iconWidth)  throws IllegalStateException {
        setAttribute("iconWidth", iconWidth, false);
    }
    /**
     * Width in pixels of the icon image.&#010 <P>&#010 If unset, defaults to <code>iconSize</code>
     *
     *
     * @return Integer
     *
     */
    public Integer getIconWidth()  {
        return getAttributeAsInt("iconWidth");
    }

    /**
    * Height in pixels of the icon image.&#010 <P>&#010 If unset, defaults to <code>iconSize</code>
    *
    * @param iconHeight iconHeight Default value is null
    * @throws IllegalStateException this property cannot be changed after the component has been created
    */
    public void setIconHeight(Integer iconHeight)  throws IllegalStateException {
        setAttribute("iconHeight", iconHeight, false);
    }
    /**
     * Height in pixels of the icon image.&#010 <P>&#010 If unset, defaults to <code>iconSize</code>
     *
     *
     * @return Integer
     *
     */
    public Integer getIconHeight()  {
        return getAttributeAsInt("iconHeight");
    }

    /**
    * If this button is showing an icon should it appear to the left or right of the title?&#010 valid options are <code>"left"</code> and <code>"right"</code>.
    * Changes the orientation of the icon relative to the text of the button.&#010&#010
    *
    * @param iconOrientation The new orientation of the icon relative to the text of the button.. Default value is "left"
    * @throws IllegalStateException this property cannot be changed after the component has been created
    */
    public void setIconOrientation(String iconOrientation)  throws IllegalStateException {
        setAttribute("iconOrientation", iconOrientation, false);
    }
    /**
     * If this button is showing an icon should it appear to the left or right of the title?&#010 valid options are <code>"left"</code> and <code>"right"</code>.
     *
     *
     * @return String
     *
     */
    public String getIconOrientation()  {
        return getAttributeAsString("iconOrientation");
    }

    /**
    * If this button is showing an icon should it be right or left aligned?
    *
    * @param iconAlign iconAlign Default value is null
    * @throws IllegalStateException this property cannot be changed after the component has been created
    */
    public void setIconAlign(String iconAlign)  throws IllegalStateException {
        setAttribute("iconAlign", iconAlign, false);
    }
    /**
     * If this button is showing an icon should it be right or left aligned?
     *
     *
     * @return String
     *
     */
    public String getIconAlign()  {
        return getAttributeAsString("iconAlign");
    }

    /**
    * Optional icon to be shown with the button title text.  &#010 <P>&#010 Specify as the partial URL to an image, relative to the imgDir of this component.
    *
    * @param iconSpacing iconSpacing Default value is null
    */
    public void setIconSpacing(String iconSpacing) {
        setAttribute("iconSpacing", iconSpacing, true);
    }
    /**
     * Optional icon to be shown with the button title text.  &#010 <P>&#010 Specify as the partial URL to an image, relative to the imgDir of this component.
     *
     *
     * @return String
     *
     */
    public String getIconSpacing()  {
        return getAttributeAsString("iconSpacing");
    }

    /**
    * If using an icon for this button, whether to switch the icon image if the button becomes&#010 disabled.
    *
    * @param showDisabledIcon showDisabledIcon Default value is true
    * @throws IllegalStateException this property cannot be changed after the component has been created
    */
    public void setShowDisabledIcon(Boolean showDisabledIcon)  throws IllegalStateException {
        setAttribute("showDisabledIcon", showDisabledIcon, false);
    }
    /**
     * If using an icon for this button, whether to switch the icon image if the button becomes&#010 disabled.
     *
     *
     * @return Boolean
     *
     */
    public Boolean getShowDisabledIcon()  {
        return getAttributeAsBoolean("showDisabledIcon");
    }

    /**
    * If using an icon for this button, whether to switch the icon image on mouse rollover.
    *
    * @param showRollOverIcon showRollOverIcon Default value is false
    * @throws IllegalStateException this property cannot be changed after the component has been created
    */
    public void setShowRollOverIcon(Boolean showRollOverIcon)  throws IllegalStateException {
        setAttribute("showRollOverIcon", showRollOverIcon, false);
    }
    /**
     * If using an icon for this button, whether to switch the icon image on mouse rollover.
     *
     *
     * @return Boolean
     *
     */
    public Boolean getShowRollOverIcon()  {
        return getAttributeAsBoolean("showRollOverIcon");
    }

    /**
    * If using an icon for this button, whether to switch the icon image when the button&#010 recieves focus.&#010 <P>&#010 If {@link com.smartgwt.client.widgets.StatefulCanvas#getShowFocusedAsOver showFocusedAsOver} is true, the <code>"Over"</code> icon will be&#010 displayed when the canvas has focus, otherwise a seperate <code>"Focused"</code> icon&#010 will be displayed
    *
    * @param showFocusedIcon showFocusedIcon Default value is false
    * @throws IllegalStateException this property cannot be changed after the component has been created
    */
    public void setShowFocusedIcon(Boolean showFocusedIcon)  throws IllegalStateException {
        setAttribute("showFocusedIcon", showFocusedIcon, false);
    }
    /**
     * If using an icon for this button, whether to switch the icon image when the button&#010 recieves focus.&#010 <P>&#010 If {@link com.smartgwt.client.widgets.StatefulCanvas#getShowFocusedAsOver showFocusedAsOver} is true, the <code>"Over"</code> icon will be&#010 displayed when the canvas has focus, otherwise a seperate <code>"Focused"</code> icon&#010 will be displayed
     *
     *
     * @return Boolean
     *
     */
    public Boolean getShowFocusedIcon()  {
        return getAttributeAsBoolean("showFocusedIcon");
    }

    /**
    * If using an icon for this button, whether to switch the icon image when the mouse goes&#010 down on the button.
    *
    * @param showDownIcon showDownIcon Default value is false
    * @throws IllegalStateException this property cannot be changed after the component has been created
    */
    public void setShowDownIcon(Boolean showDownIcon)  throws IllegalStateException {
        setAttribute("showDownIcon", showDownIcon, false);
    }
    /**
     * If using an icon for this button, whether to switch the icon image when the mouse goes&#010 down on the button.
     *
     *
     * @return Boolean
     *
     */
    public Boolean getShowDownIcon()  {
        return getAttributeAsBoolean("showDownIcon");
    }

    /**
    * If using an icon for this button, whether to switch the icon image when the button&#010 becomes selected.
    *
    * @param showSelectedIcon showSelectedIcon Default value is false
    * @throws IllegalStateException this property cannot be changed after the component has been created
    */
    public void setShowSelectedIcon(Boolean showSelectedIcon)  throws IllegalStateException {
        setAttribute("showSelectedIcon", showSelectedIcon, false);
    }
    /**
     * If using an icon for this button, whether to switch the icon image when the button&#010 becomes selected.
     *
     *
     * @return Boolean
     *
     */
    public Boolean getShowSelectedIcon()  {
        return getAttributeAsBoolean("showSelectedIcon");
    }

    /**
    * If true, ignore the specified size of this widget and always size just large&#010 enough to accomodate the title.  If <code>setWidth()</code> is explicitly called on an&#010 autoFit:true button, autoFit will be reset to <code>false</code>.&#010 <P>&#010 Note that for StretchImgButton instances, autoFit will occur horizontally only, as &#010 unpredictable vertical sizing is likely to distort the media. If you do want vertical &#010 auto-fit, this can be achieved by simply setting a small height, and having &#010 overflow:"visible"
    * Setter method for the {@link com.smartgwt.client.widgets.StatefulCanvas#getAutoFit autoFit} property. Pass in true or false to turn&#010 autoFit on or off. When autoFit is set to <code>false</code>, canvas will be resized to&#010 it's previously specified size.&#010
    *
    * @param autoFit New autoFit setting.. Default value is null
    */
    public void setAutoFit(Boolean autoFit) {
        setAttribute("autoFit", autoFit, true);
    }
    /**
     * If true, ignore the specified size of this widget and always size just large&#010 enough to accomodate the title.  If <code>setWidth()</code> is explicitly called on an&#010 autoFit:true button, autoFit will be reset to <code>false</code>.&#010 <P>&#010 Note that for StretchImgButton instances, autoFit will occur horizontally only, as &#010 unpredictable vertical sizing is likely to distort the media. If you do want vertical &#010 auto-fit, this can be achieved by simply setting a small height, and having &#010 overflow:"visible"
     *
     *
     * @return Boolean
     *
     */
    public Boolean getAutoFit()  {
        return getAttributeAsBoolean("autoFit");
    }

    /**
    * Base CSS style.  As the component changes state and/or is selected, suffixes will be&#010 added to the base style.&#010 <P>&#010 When the component changes state (eg becomes disabled), a suffix will be appended to this&#010 style name, reflecting the following states: "Over", "Down", or "Disabled".&#010 <P>&#010 If the widget is selected, the suffixes will be "Selected", "SelectedOver", etc.&#010 <P>&#010 If the widget has focus and {@link com.smartgwt.client.widgets.StatefulCanvas#getShowFocused showFocused} is true, and&#010 {@link com.smartgwt.client.widgets.StatefulCanvas#getShowFocusedAsOver showFocusedAsOver} is false, the suffixes will be "Focused",&#010 "FocusedOver", etc, or if the widget is both selected and focused, "SelectedFocused",&#010 "SelectedFocusedOver", etc.&#010 <P>&#010 For example, if <code>baseStyle</code> is set to "button", this component is&#010 {@link com.smartgwt.client.widgets.ImgButton#isSelected} and the mouse cursor is over this component, the style&#010 "buttonSelectedOver" will be used.
    * Sets the base CSS style.  As the component changes state and/or is selected, suffixes will be&#010 added to the base style.&#010
    *
    * @param baseStyle new base style. Default value is "imgButton"
    */
    public void setBaseStyle(String baseStyle) {
        setAttribute("baseStyle", baseStyle, true);
    }
    /**
     * Base CSS style.  As the component changes state and/or is selected, suffixes will be&#010 added to the base style.&#010 <P>&#010 When the component changes state (eg becomes disabled), a suffix will be appended to this&#010 style name, reflecting the following states: "Over", "Down", or "Disabled".&#010 <P>&#010 If the widget is selected, the suffixes will be "Selected", "SelectedOver", etc.&#010 <P>&#010 If the widget has focus and {@link com.smartgwt.client.widgets.StatefulCanvas#getShowFocused showFocused} is true, and&#010 {@link com.smartgwt.client.widgets.StatefulCanvas#getShowFocusedAsOver showFocusedAsOver} is false, the suffixes will be "Focused",&#010 "FocusedOver", etc, or if the widget is both selected and focused, "SelectedFocused",&#010 "SelectedFocusedOver", etc.&#010 <P>&#010 For example, if <code>baseStyle</code> is set to "button", this component is&#010 {@link com.smartgwt.client.widgets.ImgButton#isSelected} and the mouse cursor is over this component, the style&#010 "buttonSelectedOver" will be used.
     *
     *
     * @return String
     *
     */
    public String getBaseStyle()  {
        return getAttributeAsString("baseStyle");
    }

    /**
    * Whether this component is selected.  For some components, selection affects appearance.
    * Select this object.&#010
    *
    * @param selected selected Default value is false
    */
    public void setSelected(Boolean selected) {
        setAttribute("selected", selected, true);
    }
    /**
     * Whether this component is selected.  For some components, selection affects appearance.
     *
     *
     * @return Boolean
     *
     */
    public Boolean getSelected()  {
        return getAttributeAsBoolean("selected");
    }

    /**
    * String identifier for this canvas's mutually exclusive selection group.
    * <p><b>Note : </b> This is an advanced setting</p>
    *
    * @param radioGroup radioGroup Default value is null
    */
    public void setRadioGroup(String radioGroup) {
        setAttribute("radioGroup", radioGroup, true);
    }
    /**
     * String identifier for this canvas's mutually exclusive selection group.
     *
     *
     * @return String
     *
     */
    public String getRadioGroup()  {
        return getAttributeAsString("radioGroup");
    }
             
    /**
    * Behavior on state changes -- BUTTON, RADIO or CHECKBOX
    * Update the 'actionType' for this canvas (radio / checkbox / button)&#010 If the canvas is currently selected, and the passed in actionType is 'button'&#010 this method will deselect the canvas.&#010
    *
    * @param actionType actionType Default value is "button"
    */
    public void setActionType(SelectionType actionType) {
        setAttribute("actionType", actionType.getValue(), true);
    }
    /**
     * Behavior on state changes -- BUTTON, RADIO or CHECKBOX
     *
     *
     * @return Return the 'actionType' for this canvas (radio / checkbox / button)&#010
     *
     */
    public SelectionType getActionType()  {
        return (SelectionType) EnumUtil.getEnum(SelectionType.values(), getAttribute("actionType"));
    }
             
    /**
    * Current "state" of this widget. StatefulCanvases will have a different appearance based&#010 on their current state. By default this is handled by changing the css className applied to&#010 the StatefulCanvas - see {@link com.smartgwt.client.widgets.StatefulCanvas#getBaseStyle baseStyle} for a description of how this is&#010 done.<P>&#010 For {@link com.smartgwt.client.widgets.Img} or {@link com.smartgwt.client.widgets.StretchImg} based subclasses of StatefulCanvas, the &#010 appearance may also be updated by changing the src of the rendered image. See&#010 {@link com.smartgwt.client.widgets.Img#getSrc src} and {@link com.smartgwt.client.widgets.StretchImgButton#getSrc src} for a description of how the URL &#010 is modified to reflect the state of the widget in this case.
    * Set the 'state' of this object, this changes it's appearance.&#010&#010
    * <p><b>Note : </b> This is an advanced setting</p>
    *
    * @param state new state. Default value is ""
    */
    public void setState(State state) {
        setAttribute("state", state.getValue(), true);
    }
    /**
     * Current "state" of this widget. StatefulCanvases will have a different appearance based&#010 on their current state. By default this is handled by changing the css className applied to&#010 the StatefulCanvas - see {@link com.smartgwt.client.widgets.StatefulCanvas#getBaseStyle baseStyle} for a description of how this is&#010 done.<P>&#010 For {@link com.smartgwt.client.widgets.Img} or {@link com.smartgwt.client.widgets.StretchImg} based subclasses of StatefulCanvas, the &#010 appearance may also be updated by changing the src of the rendered image. See&#010 {@link com.smartgwt.client.widgets.Img#getSrc src} and {@link com.smartgwt.client.widgets.StretchImgButton#getSrc src} for a description of how the URL &#010 is modified to reflect the state of the widget in this case.
     *
     *
     * @return Return the state of this StatefulCanvas&#010
     *
     */
    public State getState()  {
        return (State) EnumUtil.getEnum(State.values(), getAttribute("state"));
    }

    /**
    * Should we visibly change state when disabled?
    *
    * @param showDisabled showDisabled Default value is true
    */
    public void setShowDisabled(Boolean showDisabled) {
        setAttribute("showDisabled", showDisabled, true);
    }
    /**
     * Should we visibly change state when disabled?
     *
     *
     * @return Boolean
     *
     */
    public Boolean getShowDisabled()  {
        return getAttributeAsBoolean("showDisabled");
    }

    /**
    * Should we visibly change state when the mouse goes down in this object?
    *
    * @param showDown showDown Default value is false
    */
    public void setShowDown(Boolean showDown) {
        setAttribute("showDown", showDown, true);
    }
    /**
     * Should we visibly change state when the mouse goes down in this object?
     *
     *
     * @return Boolean
     *
     */
    public Boolean getShowDown()  {
        return getAttributeAsBoolean("showDown");
    }

    /**
    * Should we visibly change state when the canvas recieves focus?  If&#010 {@link com.smartgwt.client.widgets.StatefulCanvas#getShowFocusedAsOver showFocusedAsOver} is <code>true</code>, the <b><code>"over"</code></b>&#010 will be used to indicate focus. Otherwise a separate <b><code>"focused"</code></b> state&#010 will be used.
    *
    * @param showFocused showFocused Default value is false
    */
    public void setShowFocused(Boolean showFocused) {
        setAttribute("showFocused", showFocused, true);
    }
    /**
     * Should we visibly change state when the canvas recieves focus?  If&#010 {@link com.smartgwt.client.widgets.StatefulCanvas#getShowFocusedAsOver showFocusedAsOver} is <code>true</code>, the <b><code>"over"</code></b>&#010 will be used to indicate focus. Otherwise a separate <b><code>"focused"</code></b> state&#010 will be used.
     *
     *
     * @return Boolean
     *
     */
    public Boolean getShowFocused()  {
        return getAttributeAsBoolean("showFocused");
    }

    /**
    * Should we visibly change state when the mouse goes over this object?
    *
    * @param showRollOver showRollOver Default value is false
    */
    public void setShowRollOver(Boolean showRollOver) {
        setAttribute("showRollOver", showRollOver, true);
    }
    /**
     * Should we visibly change state when the mouse goes over this object?
     *
     *
     * @return Boolean
     *
     */
    public Boolean getShowRollOver()  {
        return getAttributeAsBoolean("showRollOver");
    }
             
    /**
    * Horizontal alignment of this component's title.
    *
    * @param align align Default value is Canvas.CENTER
    */
    public void setAlign(Alignment align) {
        setAttribute("align", align.getValue(), true);
    }
    /**
     * Horizontal alignment of this component's title.
     *
     *
     * @return Alignment
     *
     */
    public Alignment getAlign()  {
        return (Alignment) EnumUtil.getEnum(Alignment.values(), getAttribute("align"));
    }
             
    /**
    * Vertical alignment of this component's title.
    *
    * @param valign valign Default value is Canvas.CENTER
    */
    public void setValign(VerticalAlignment valign) {
        setAttribute("valign", valign.getValue(), true);
    }
    /**
     * Vertical alignment of this component's title.
     *
     *
     * @return VerticalAlignment
     *
     */
    public VerticalAlignment getValign()  {
        return (VerticalAlignment) EnumUtil.getEnum(VerticalAlignment.values(), getAttribute("valign"));
    }

    /**
    * Determines whether any specified {@link com.smartgwt.client.widgets.StatefulCanvas#getTitle} will be &#010 displayed for this component.<br>&#010 Applies to Image-based components only, where the title will be rendered out in a label&#010 floating over the component
    * <p><b>Note : </b> This is an advanced setting</p>
    *
    * @param showTitle showTitle Default value is false
    */
    public void setShowTitle(Boolean showTitle) {
        setAttribute("showTitle", showTitle, true);
    }
    /**
     * Determines whether any specified {@link com.smartgwt.client.widgets.StatefulCanvas#getTitle} will be &#010 displayed for this component.<br>&#010 Applies to Image-based components only, where the title will be rendered out in a label&#010 floating over the component
     *
     *
     * @return Boolean
     *
     */
    public Boolean getShowTitle()  {
        return getAttributeAsBoolean("showTitle");
    }

    /**
    * Horizontal padding to be applied to this widget's label. If this value is null, &#010 the label will be given a horizontal padding of zero.&#010 <p>&#010 The specified amount of padding is applied to the left and right edges of the button, so&#010 the total amount of padding is 2x the specified value.
    *
    * @param labelHPad labelHPad Default value is null
    */
    public void setLabelHPad(Integer labelHPad) {
        setAttribute("labelHPad", labelHPad, true);
    }
    /**
     * Horizontal padding to be applied to this widget's label. If this value is null, &#010 the label will be given a horizontal padding of zero.&#010 <p>&#010 The specified amount of padding is applied to the left and right edges of the button, so&#010 the total amount of padding is 2x the specified value.
     *
     *
     * @return Integer
     *
     */
    public Integer getLabelHPad()  {
        return getAttributeAsInt("labelHPad");
    }

    /**
    * Vertical padding to be applied to this widget's label. If this value is null, &#010 the label will be given a vertial padding of zero.&#010 <p>&#010 The specified amount of padding is applied to the top and bottom edges of the button, so&#010 the total amount of padding is 2x the specified value.
    *
    * @param labelVPad labelVPad Default value is null
    */
    public void setLabelVPad(Integer labelVPad) {
        setAttribute("labelVPad", labelVPad, true);
    }
    /**
     * Vertical padding to be applied to this widget's label. If this value is null, &#010 the label will be given a vertial padding of zero.&#010 <p>&#010 The specified amount of padding is applied to the top and bottom edges of the button, so&#010 the total amount of padding is 2x the specified value.
     *
     *
     * @return Integer
     *
     */
    public Integer getLabelVPad()  {
        return getAttributeAsInt("labelVPad");
    }

    /**
    * The base filename for the image.&#010 <P>&#010 If <code>img.state</code> is set, it's value will be appended to the URL before the&#010 file extension.  &#010 <P>&#010 For example, given an <code>src</code> of "findIcon.gif" and a state of&#010 "Disabled", the resulting image name would be "findIcon_Disabled.gif".  Compound states&#010 such as "Selected", "Focused" and "Over" or "Down" will have an intervening underscore,&#010 resulting in, for example, <code>"findIcon_Selected_Down.gif"</code>.
    *
    * @param src src Default value is "[SKIN]/ImgButton/button.png"
    */
    public void setSrc(String src) {
        setAttribute("src", src, true);
    }
    /**
     * The base filename for the image.&#010 <P>&#010 If <code>img.state</code> is set, it's value will be appended to the URL before the&#010 file extension.  &#010 <P>&#010 For example, given an <code>src</code> of "findIcon.gif" and a state of&#010 "Disabled", the resulting image name would be "findIcon_Disabled.gif".  Compound states&#010 such as "Selected", "Focused" and "Over" or "Down" will have an intervening underscore,&#010 resulting in, for example, <code>"findIcon_Selected_Down.gif"</code>.
     *
     *
     * @return String
     *
     */
    public String getSrc()  {
        return getAttributeAsString("src");
    }

    // ********************* Methods ***********************







        /**
         * Select this object.&#010
         */
        public native void select() /*-{
            var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
            self.select();
        }-*/;

        /**
         * Select this object.&#010
         */
        public native void deselect() /*-{
            var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
            self.deselect();
        }-*/;

        /**
         * Find out if this object is selected&#010
         *
         * @return 
         */
        public native Boolean isSelected() /*-{
            var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
            var retVal =self.isSelected();
            if(retVal == null || retVal === undefined) {
                return null;
            } else {
                return @com.smartgwt.client.util.JSOHelper::toBoolean(Z)(retVal);
            }
        }-*/;


        /**
         * Add this widget to the specified mutually exclusive selection group with the ID&#010 passed in.&#010 Selecting this widget will then deselect any other StatefulCanvases with the same&#010 radioGroup ID.&#010 StatefulCanvases can belong to only one radioGroup, so this method will remove from &#010 any other radiogroup of which this button is already a member.&#010
         * @param groupID - ID of the radiogroup to which this widget should be added
         */
        public native void addToRadioGroup(String groupID) /*-{
            var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
            self.addToRadioGroup(groupID);
        }-*/;

        /**
         * Remove this widget from the specified mutually exclusive selection group with the ID&#010 passed in.&#010 No-op's if this widget is not a member of the groupID passed in.&#010 If no groupID is passed in, defaults to removing from whatever radioGroup this widget&#010 is a member of.&#010
         */
        public native void removeFromRadioGroup() /*-{
            var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
            self.removeFromRadioGroup();
        }-*/;

        /**
         * Remove this widget from the specified mutually exclusive selection group with the ID&#010 passed in.&#010 No-op's if this widget is not a member of the groupID passed in.&#010 If no groupID is passed in, defaults to removing from whatever radioGroup this widget&#010 is a member of.&#010
         * @param groupID - optional radio group ID (to ensure the widget is removed                                        from the appropriate group.
         */
        public native void removeFromRadioGroup(String groupID) /*-{
            var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
            self.removeFromRadioGroup(groupID);
        }-*/;




        /**
         * Enable or disable this object&#010
         * @param disabled true if this widget is to be disabled
         */
        public native void setDisabled(boolean disabled) /*-{
            var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
            self.setDisabled(disabled);
        }-*/;


        /**
         * This property contains the default 'action' for the Button to fire when activated.&#010
         */
        public native void action() /*-{
            var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
            self.action();
        }-*/;

    // ********************* Static Methods ***********************

}



