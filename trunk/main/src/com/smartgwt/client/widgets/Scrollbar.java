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
    * The Scrollbar widget implements cross-platform, image-based scrollbars that control the&#010 scrolling of content in other widgets.  Scrollbar widgets are created and displayed&#010 automatically for widgets that require them, based on settings for {@link com.smartgwt.client.widgets.Canvas#getOverflow overflow}.&#010 <P>&#010 The scrollbar's appearance is based on a {@link com.smartgwt.client.widgets.StretchImg} for the "track", which consists&#010 of two fixed size buttons and a stretchable center segment, and the {@link com.smartgwt.client..ScrollThumb},&#010 the draggable portion of the scrollbar, also a StretchImg, with an optional&#010 {@link com.smartgwt.client.widgets.StretchImg#getShowGrip 'grip'}.

    */
public class Scrollbar extends StretchImg {

    public static Scrollbar getOrCreateRef(JavaScriptObject jsObj) {
        if(jsObj == null) return null;
        BaseWidget obj = BaseWidget.getRef(jsObj);
        if(obj != null) {
            return (Scrollbar) obj;
        } else {
            return new Scrollbar(jsObj);
        }
    }


    public Scrollbar(){
        
    }

    public Scrollbar(JavaScriptObject jsObj){
        super(jsObj);
    }

    protected native JavaScriptObject create()/*-{
        var config = this.@com.smartgwt.client.widgets.BaseWidget::getConfig()();
        var widget = $wnd.isc.Scrollbar.create(config);
        this.@com.smartgwt.client.widgets.BaseWidget::doInit()();
        return widget;
    }-*/;
    // ********************* Properties / Attributes ***********************

    /**
    * The size of the square buttons (arrows) at the ends of this scrollbar. This &#010 overrides the width of a vertical scrollbar or the height of a horizontal scrollbar&#010 to set the scrollbar's thickness.
    *
    * @param btnSize btnSize Default value is 16
    */
    public void setBtnSize(int btnSize) {
        setAttribute("btnSize", btnSize, true);
    }
    /**
     * The size of the square buttons (arrows) at the ends of this scrollbar. This &#010 overrides the width of a vertical scrollbar or the height of a horizontal scrollbar&#010 to set the scrollbar's thickness.
     *
     *
     * @return int
     *
     */
    public int getBtnSize()  {
        return getAttributeAsInt("btnSize");
    }

    /**
    * If true, this scrollbar will automatically enable when the scrollTarget is&#010 scrollable (i.e., when the contents of the scrollTarget exceed its clip size in the&#010 direction relevant to this scrollbar), and automatically disable when the&#010 scrollTarget is not scrollable. Set this property to false for full manual control&#010 over a scrollbar's enabled state.
    * <p><b>Note : </b> This is an advanced setting</p>
    *
    * @param autoEnable autoEnable Default value is true
    */
    public void setAutoEnable(Boolean autoEnable) {
        setAttribute("autoEnable", autoEnable, true);
    }
    /**
     * If true, this scrollbar will automatically enable when the scrollTarget is&#010 scrollable (i.e., when the contents of the scrollTarget exceed its clip size in the&#010 direction relevant to this scrollbar), and automatically disable when the&#010 scrollTarget is not scrollable. Set this property to false for full manual control&#010 over a scrollbar's enabled state.
     *
     *
     * @return Boolean
     *
     */
    public Boolean getAutoEnable()  {
        return getAttributeAsBoolean("autoEnable");
    }

    /**
    * If true, displays a corner piece at the bottom end of a vertical scrollbar, or the&#010 right end of a horizontal scrollbar. This is typically set only when both horizontal&#010 and vertical scrollbars are displayed and about the same corner.
    * <p><b>Note : </b> This is an advanced setting</p>
    *
    * @param showCorner showCorner Default value is false
    * @throws IllegalStateException this property cannot be changed after the component has been created
    */
    public void setShowCorner(Boolean showCorner)  throws IllegalStateException {
        setAttribute("showCorner", showCorner, false);
    }
    /**
     * If true, displays a corner piece at the bottom end of a vertical scrollbar, or the&#010 right end of a horizontal scrollbar. This is typically set only when both horizontal&#010 and vertical scrollbars are displayed and about the same corner.
     *
     *
     * @return Boolean
     *
     */
    public Boolean getShowCorner()  {
        return getAttributeAsBoolean("showCorner");
    }

    /**
    * If true, the thumb's appearance changes when it's clicked on.
    * <p><b>Note : </b> This is an advanced setting</p>
    *
    * @param allowThumbDownState allowThumbDownState Default value is false
    * @throws IllegalStateException this property cannot be changed after the component has been created
    */
    public void setAllowThumbDownState(Boolean allowThumbDownState)  throws IllegalStateException {
        setAttribute("allowThumbDownState", allowThumbDownState, false);
    }
    /**
     * If true, the thumb's appearance changes when it's clicked on.
     *
     *
     * @return Boolean
     *
     */
    public Boolean getAllowThumbDownState()  {
        return getAttributeAsBoolean("allowThumbDownState");
    }

    /**
    * If true, the thumb's appearance changes when the user rolls over it.
    * <p><b>Note : </b> This is an advanced setting</p>
    *
    * @param allowThumbOverState allowThumbOverState Default value is false
    * @throws IllegalStateException this property cannot be changed after the component has been created
    */
    public void setAllowThumbOverState(Boolean allowThumbOverState)  throws IllegalStateException {
        setAttribute("allowThumbOverState", allowThumbOverState, false);
    }
    /**
     * If true, the thumb's appearance changes when the user rolls over it.
     *
     *
     * @return Boolean
     *
     */
    public Boolean getAllowThumbOverState()  {
        return getAttributeAsBoolean("allowThumbOverState");
    }

    /**
    * If true, the scrollbar uses a 5-segment rather than 3-segment image representation,&#010 where the 3 interior image segments have the same state (Down, Over, etc), independent&#010 of the two outermost image segments.  &#010 <P>&#010 This allows certain advanced skinning designs where the track-as-such (space in which&#010 the thumb may be dragged) has curved endcaps, and is also visually stateful (that is,&#010 changes when the mouse goes down, without affecting the appearance of the outermost&#010 segments).
    * <p><b>Note : </b> This is an advanced setting</p>
    *
    * @param showTrackEnds showTrackEnds Default value is false
    * @throws IllegalStateException this property cannot be changed after the component has been created
    */
    public void setShowTrackEnds(Boolean showTrackEnds)  throws IllegalStateException {
        setAttribute("showTrackEnds", showTrackEnds, false);
    }
    /**
     * If true, the scrollbar uses a 5-segment rather than 3-segment image representation,&#010 where the 3 interior image segments have the same state (Down, Over, etc), independent&#010 of the two outermost image segments.  &#010 <P>&#010 This allows certain advanced skinning designs where the track-as-such (space in which&#010 the thumb may be dragged) has curved endcaps, and is also visually stateful (that is,&#010 changes when the mouse goes down, without affecting the appearance of the outermost&#010 segments).
     *
     *
     * @return Boolean
     *
     */
    public Boolean getShowTrackEnds()  {
        return getAttributeAsBoolean("showTrackEnds");
    }

    /**
    * The minimum pixel size of the draggable thumb regardless of how large the scrolling&#010 region becomes.
    * <p><b>Note : </b> This is an advanced setting</p>
    *
    * @param thumbMinSize thumbMinSize Default value is 12
    * @throws IllegalStateException this property cannot be changed after the component has been created
    */
    public void setThumbMinSize(int thumbMinSize)  throws IllegalStateException {
        setAttribute("thumbMinSize", thumbMinSize, false);
    }
    /**
     * The minimum pixel size of the draggable thumb regardless of how large the scrolling&#010 region becomes.
     *
     *
     * @return int
     *
     */
    public int getThumbMinSize()  {
        return getAttributeAsInt("thumbMinSize");
    }

    /**
    * The minimum pixel width of the track end segments (if enabled with showTrackEnds).
    * <p><b>Note : </b> This is an advanced setting</p>
    *
    * @param trackEndWidth trackEndWidth Default value is 12
    * @throws IllegalStateException this property cannot be changed after the component has been created
    */
    public void setTrackEndWidth(int trackEndWidth)  throws IllegalStateException {
        setAttribute("trackEndWidth", trackEndWidth, false);
    }
    /**
     * The minimum pixel width of the track end segments (if enabled with showTrackEnds).
     *
     *
     * @return int
     *
     */
    public int getTrackEndWidth()  {
        return getAttributeAsInt("trackEndWidth");
    }

    /**
    * The minimum pixel height of the track end segments (if enabled with showTrackEnds).
    * <p><b>Note : </b> This is an advanced setting</p>
    *
    * @param trackEndHeight trackEndHeight Default value is 12
    * @throws IllegalStateException this property cannot be changed after the component has been created
    */
    public void setTrackEndHeight(int trackEndHeight)  throws IllegalStateException {
        setAttribute("trackEndHeight", trackEndHeight, false);
    }
    /**
     * The minimum pixel height of the track end segments (if enabled with showTrackEnds).
     *
     *
     * @return int
     *
     */
    public int getTrackEndHeight()  {
        return getAttributeAsInt("trackEndHeight");
    }

    /**
    * Number of pixels the thumb is allowed to overlap the buttons at each end of the track.&#010 Default prevents doubling of 1px borders.  Set higher to allow media that shows curved&#010 joins between the track button and ScrollThumb.
    * <p><b>Note : </b> This is an advanced setting</p>
    *
    * @param thumbOverlap thumbOverlap Default value is 1
    * @throws IllegalStateException this property cannot be changed after the component has been created
    */
    public void setThumbOverlap(int thumbOverlap)  throws IllegalStateException {
        setAttribute("thumbOverlap", thumbOverlap, false);
    }
    /**
     * Number of pixels the thumb is allowed to overlap the buttons at each end of the track.&#010 Default prevents doubling of 1px borders.  Set higher to allow media that shows curved&#010 joins between the track button and ScrollThumb.
     *
     *
     * @return int
     *
     */
    public int getThumbOverlap()  {
        return getAttributeAsInt("thumbOverlap");
    }

    /**
    * Number of pixels the thumb is allowed to overlap the buttons at the start of the track.&#010 Default prevents doubling of 1px borders.  Set higher to allow media that shows curved&#010 joins between the track button and ScrollThumb.
    * <p><b>Note : </b> This is an advanced setting</p>
    *
    * @param startThumbOverlap startThumbOverlap Default value is null
    * @throws IllegalStateException this property cannot be changed after the component has been created
    */
    public void setStartThumbOverlap(Integer startThumbOverlap)  throws IllegalStateException {
        setAttribute("startThumbOverlap", startThumbOverlap, false);
    }
    /**
     * Number of pixels the thumb is allowed to overlap the buttons at the start of the track.&#010 Default prevents doubling of 1px borders.  Set higher to allow media that shows curved&#010 joins between the track button and ScrollThumb.
     *
     *
     * @return Integer
     *
     */
    public Integer getStartThumbOverlap()  {
        return getAttributeAsInt("startThumbOverlap");
    }

    /**
    * Number of pixels the thumb is allowed to overlap the buttons at the end of the track.&#010 Default prevents doubling of 1px borders.  Set higher to allow media that shows curved&#010 joins between the track button and ScrollThumb.
    * <p><b>Note : </b> This is an advanced setting</p>
    *
    * @param endThumbOverlap endThumbOverlap Default value is null
    * @throws IllegalStateException this property cannot be changed after the component has been created
    */
    public void setEndThumbOverlap(Integer endThumbOverlap)  throws IllegalStateException {
        setAttribute("endThumbOverlap", endThumbOverlap, false);
    }
    /**
     * Number of pixels the thumb is allowed to overlap the buttons at the end of the track.&#010 Default prevents doubling of 1px borders.  Set higher to allow media that shows curved&#010 joins between the track button and ScrollThumb.
     *
     *
     * @return Integer
     *
     */
    public Integer getEndThumbOverlap()  {
        return getAttributeAsInt("endThumbOverlap");
    }

    /**
    * Inset of the thumb relative to the track.  An inset of N pixels means the thumb is 2N&#010 pixels smaller in breadth than the track.
    * <p><b>Note : </b> This is an advanced setting</p>
    *
    * @param thumbInset thumbInset Default value is null
    * @throws IllegalStateException this property cannot be changed after the component has been created
    */
    public void setThumbInset(Integer thumbInset)  throws IllegalStateException {
        setAttribute("thumbInset", thumbInset, false);
    }
    /**
     * Inset of the thumb relative to the track.  An inset of N pixels means the thumb is 2N&#010 pixels smaller in breadth than the track.
     *
     *
     * @return Integer
     *
     */
    public Integer getThumbInset()  {
        return getAttributeAsInt("thumbInset");
    }

    /**
    * Where are the skin images for the Scrollbar.  This is local to the {@link com.smartgwt.client.util.Page#getSkinDir}.
    * <p><b>Note : </b> This is an advanced setting</p>
    *
    * @param skinImgDir skinImgDir Default value is "images/Scrollbar/"
    * @throws IllegalStateException this property cannot be changed after the component has been created
    */
    public void setSkinImgDir(String skinImgDir)  throws IllegalStateException {
        setAttribute("skinImgDir", skinImgDir, false);
    }
    /**
     * Where are the skin images for the Scrollbar.  This is local to the {@link com.smartgwt.client.util.Page#getSkinDir}.
     *
     *
     * @return String
     *
     */
    public String getSkinImgDir()  {
        return getAttributeAsString("skinImgDir");
    }

    /**
    * URL for the corner image, a singular image that appears in the corner when both h and v&#010 scrollbars are showing.
    *
    * @param cornerSrc cornerSrc Default value is "[SKIN]corner.gif"
    * @throws IllegalStateException this property cannot be changed after the component has been created
    */
    public void setCornerSrc(String cornerSrc)  throws IllegalStateException {
        setAttribute("cornerSrc", cornerSrc, false);
    }
    /**
     * URL for the corner image, a singular image that appears in the corner when both h and v&#010 scrollbars are showing.
     *
     *
     * @return String
     *
     */
    public String getCornerSrc()  {
        return getAttributeAsString("cornerSrc");
    }

    /**
    * Allows the size of the corner segment to be set independently of the {@link com.smartgwt.client.widgets.Scrollbar#getBtnSize btnSize}.
    *
    * @param cornerSize cornerSize Default value is null
    * @throws IllegalStateException this property cannot be changed after the component has been created
    */
    public void setCornerSize(Integer cornerSize)  throws IllegalStateException {
        setAttribute("cornerSize", cornerSize, false);
    }
    /**
     * Allows the size of the corner segment to be set independently of the {@link com.smartgwt.client.widgets.Scrollbar#getBtnSize btnSize}.
     *
     *
     * @return Integer
     *
     */
    public Integer getCornerSize()  {
        return getAttributeAsInt("cornerSize");
    }

    /**
    * Base URL for the images used for the horizontal scrollbar track and end buttons.  &#010 <P>&#010 See {@link com.smartgwt.client.widgets.StretchImg#getItems items} for a general explanation of how this base URL is&#010 transformed into various pieces and states.&#010 <P>&#010 For a normal 3-segment track, the suffixes "_start", "_track" and "_end" are added to&#010 this URL.  The "start" and "end" images should appear to be buttons (the user can click&#010 on these segments to scroll slowly).  The "track" segment provides a background for the&#010 space in which the thumb can be dragged, and can also be clicked on to scroll quickly.&#010 <P>&#010 For a 5-segment track ({@link com.smartgwt.client.widgets.Scrollbar#getShowTrackEnds showTrackEnds}:true), the suffixes are "_start", "_track_start",&#010 "_track", "_track_end" and "_end".
    *
    * @param hSrc hSrc Default value is "[SKIN]hscroll.gif"
    * @throws IllegalStateException this property cannot be changed after the component has been created
    */
    public void setHSrc(String hSrc)  throws IllegalStateException {
        setAttribute("hSrc", hSrc, false);
    }
    /**
     * Base URL for the images used for the horizontal scrollbar track and end buttons.  &#010 <P>&#010 See {@link com.smartgwt.client.widgets.StretchImg#getItems items} for a general explanation of how this base URL is&#010 transformed into various pieces and states.&#010 <P>&#010 For a normal 3-segment track, the suffixes "_start", "_track" and "_end" are added to&#010 this URL.  The "start" and "end" images should appear to be buttons (the user can click&#010 on these segments to scroll slowly).  The "track" segment provides a background for the&#010 space in which the thumb can be dragged, and can also be clicked on to scroll quickly.&#010 <P>&#010 For a 5-segment track ({@link com.smartgwt.client.widgets.Scrollbar#getShowTrackEnds showTrackEnds}:true), the suffixes are "_start", "_track_start",&#010 "_track", "_track_end" and "_end".
     *
     *
     * @return String
     *
     */
    public String getHSrc()  {
        return getAttributeAsString("hSrc");
    }

    /**
    * Base URL for the images used for the vertical scrollbar track and end buttons.  See&#010 {@link com.smartgwt.client.widgets.Scrollbar#getHSrc hSrc} for usage.
    *
    * @param vSrc vSrc Default value is "[SKIN]vscroll.gif"
    * @throws IllegalStateException this property cannot be changed after the component has been created
    */
    public void setVSrc(String vSrc)  throws IllegalStateException {
        setAttribute("vSrc", vSrc, false);
    }
    /**
     * Base URL for the images used for the vertical scrollbar track and end buttons.  See&#010 {@link com.smartgwt.client.widgets.Scrollbar#getHSrc hSrc} for usage.
     *
     *
     * @return String
     *
     */
    public String getVSrc()  {
        return getAttributeAsString("vSrc");
    }

    // ********************* Methods ***********************


    // ********************* Static Methods ***********************

}



