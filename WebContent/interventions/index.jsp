<%@ include file="/tpl/header.jsp" %>
	<div class="header-bar">
		<div class="header content clearfix">
			<div class="logo">Note ton STA</div>
		    <div class="menu"><a href="<%= contextPath %>/login/register.jsp">Register</a></div>
		    <span class="signin-button">
				<a href="<%= contextPath %>/login/" class="g-button" id="link-signin">Login</a>
			</span>
		</div>
	</div>
	<div class="">
		<table cellspacing="0" cellpadding="0" border="0">
		  <tr>
		    <td width="20%" valign="top">
		    	<div class="product-logo density-tiny"><a href="./interventions/">Interventions</a></div>
		    	<div class="contentcreationpane mini-imagelessbutton-container density-tiny" id="contentcreationpane">
		        <div tabindex="0" class="goog-inline-block jfk-button jfk-button-primary goog-toolbar-item-new" role="button" style="-moz-user-select: none;" aria-haspopup="true">
		          <div class="goog-inline-block jfk-button-outer-box">
		            <div class="goog-inline-block jfk-button-inner-box">
		              <div class="goog-inline-block jfk-button-caption">CREATE</div>
		              <div class="goog-inline-block jfk-button-dropdown">&nbsp;</div>
		            </div>
		          </div>
		        </div>
		      </div>
		   	</td>
		    <td width="80%" valign="top"><div class="viewpane-toolbar density-tiny" id="viewpane-toolbar"></div>
		      <div class="doclistview-inner" id="doclistview-innercontainer" style="height: 178px;">
		        <div class="doclistview-headers-container doclistview-detailed density-tiny">
		          <table cellspacing="0" cellpadding="0" class="doclist-table doclist-header-table">
		            <colgroup>
		            <col class="doclist-col-checkbox">
		            <col class="doclist-col-star">
		            <col style="" class="doclist-col-name">
		            <col class="doclist-col-owners">
		            <col class="doclist-col-owners">
		            <col style="" class="doclist-col-date">
		            </colgroup>
		            <thead class="doclist-thead">
		              <tr class="doclist-header">
		                <td class="doclist-header-td-selection-checkbox doclist-header-td-unsortable"><span class="goog-inline-block doclist-header-inner ">
		                  <div class="goog-inline-block selectioncomponent"><span dir="ltr" tabindex="0" aria-checked="mixed" role="checkbox" class="jfk-checkbox goog-inline-block jfk-checkbox-undetermined" style="-moz-user-select: none;">
		                    <div class="jfk-checkbox-checkmark"></div>
		                    </span></div>
		                  </span></td>
		                <td class="doclist-header-star doclist-header-td-unsortable"><span class="goog-inline-block doclist-header-inner "></span></td>
		                <td class="doclist-header-name doclist-header-td-unsortable"><span class="goog-inline-block doclist-header-inner ">Subject</span></td>
		                <td class="doclist-header-owners doclist-header-td-unsortable"><span class="goog-inline-block doclist-header-inner ">Begin</span></td>
		                <td class="doclist-header-owners doclist-header-td-unsortable"><span class="goog-inline-block doclist-header-inner ">End</span></td>
		                <td class=" doclist-header-td-unsortable"><span class="goog-inline-block doclist-header-inner doclist-sorted-header">Status</span></td>
		                <td class="doclist-header-spacer doclist-header-td-unsortable"><span class="goog-inline-block doclist-header-inner "></span></td>
		              </tr>
		            </thead>
		          </table>
		          <div class="doclistview-column-resizer" style="left: 1034px; top: 0px; height: 25px;"></div>
		        </div>
		        <div class="doclistview-list jfk-scrollbar density-tiny" id="doclistview-list" style="overflow-y: scroll; padding-right: 0px;">
		          <div class="doclist-container doclistview-detailed" style="height: 0px;">
		            <table cellspacing="0" cellpadding="0" class="doclist-table">
		              <colgroup>
		              <col class="doclist-col-checkbox">
		              <col class="doclist-col-star">
		              <col style="" class="doclist-col-name">
		              <col class="doclist-col-owners">
		              <col style="" class="doclist-col-date">
		              </colgroup>
		              <thead class="doclist-thead">
		                <tr style="height:0px;"></tr>
		              </thead>
		              <tbody class="doclist-tbody">
		                
		              </tbody>
		            </table>
		          </div>
		        </div>
		      </div></td>
		  </tr>
		</table>
	</div>
<%@ include file="/tpl/footer.jsp" %>