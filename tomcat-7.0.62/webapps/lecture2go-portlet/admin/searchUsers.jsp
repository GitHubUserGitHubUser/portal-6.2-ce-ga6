<%@include file="/init.jsp"%>

<%@page import="de.uhh.l2g.plugins.search.UserSearchContainer"%>
<%@page import="de.uhh.l2g.plugins.search.UserDisplayTerms"%>

<%
	UserSearchContainer searchContainer = (UserSearchContainer)request.getAttribute("liferay-ui:search:searchContainer");
	UserDisplayTerms displayTerms = (UserDisplayTerms)searchContainer.getDisplayTerms();
	String title = LanguageUtil.get(pageContext, "search-users");
%>

<style>
<!--
	#toggle_id_user_searchtoggleAdvanced {
	    display: none;
	}
	
	.form-search .input-append .advanced-search .search-query {
	    padding-left: 10px;
	    width: 160px;
	}
	
	.taglib-search-toggle {
	    margin-top: -17px;
	}
	
	.advanced-search > button.btn {
	    visibility: hidden;
	}
	
	#toggle_id_user_searchkeywords {
	    border-radius: 0;
	}
	
	#modifiedSearch {
	    float: right;
	}
	
	.lfr-search-container {
	    margin-top: 0;
	    overflow: auto;
	    float: left;
	    width: 100%;
	}

	.advanced-search {
	    width: 187px;
	    padding: 0 !important;
	    margin: 0 !important;
	}

	.add-link {
	    position: relative;
	    float: left;
	    margin-top: 8px;
	}	
	
	.alert.alert-info {
	    margin-top: 0px;
	}

    .aui .alert {
        border-width: 0;
    }
	
-->
</style>

<script type="text/javascript">
	$(document).ready(function (){
		var t = "<%=title%>";
		$("#toggle_id_user_searchkeywords").attr("placeholder", t);
	});
</script>

<liferay-ui:search-toggle buttonLabel="" displayTerms="<%= displayTerms %>" id="toggle_id_user_search" >
</liferay-ui:search-toggle>

