<%@ taglib prefix="c"       uri="http://java.sun.com/jsp/jstl/core" %>
<!-- **** Image - icons **** -->
<c:url value="/ui/bootstrap-3.1.1/images/calendar52.png" var="urlImgGlyphLeaveAnnual"/>
<c:url value="/ui/bootstrap-3.1.1/images/university2.png" var="urlImgGlyphScholarship"/>
<c:url value="/ui/bootstrap-3.1.1/images/glyphicons_190_circle_plus.png" var="urlImgGlyphAdd"/>
<c:url value="/ui/bootstrap-3.1.1/images/glyphicons_150_edit.png" var="urlImgGlyphUpdate"/>
<c:url value="/ui/bootstrap-3.1.1/images/glyphicons_256_delete.png" var="urlImgGlyphDelete"/>
<c:url value="/ui/bootstrap-3.1.1/images/open182.png" var="urlImgGlyphBook"/>

<!-- ******************** CSS Declaration************************ --> 
<c:url value="/ui/bootstrap-3.1.1/dist/css/bootstrap.min.css" var="urlCssBootstrapMin"/>
<c:url value="/ui/bootstrap-3.1.1/dist/css/bootstrap-theme.min.css" var="urlCssBootstrapThemeMin"/>
<c:url value="/ui/gen/css/normalize.css" var="urlCssNormalize"/>
<c:url value="/ui/jqgrid-4.6.0/css/ui.jqgrid.css" var="urlCssjqgrid"/>
<c:url value="/ui/gen/css/jquery-ui-custom.css" var="urlCssJQueryUiCustom"/>
<c:url value="/ui/gen/css/AdminLTE.css" var="urlCssAdminLTE"/>

<c:url value="/ui/bootstrapvalidator-0.5.3/css/bootstrapValidator.min.css" var="urlCssValidatorBootStrap"/>

<!-- **** Image - jqgrid **** -->
<c:url value="/ui/images/jqgrid/ui-icons_6da8d5_256x240.png" var="urlImg6da8d5"/> 
<c:url value="/ui/images/jqgrid/ui-icons_469bdd_256x240.png" var="urlImg469bdd"/>
<c:url value="/ui/images/jqgrid/ui-bg_glass_85_dfeffc_1x400.png" var="urlImgbgGlass85"/>
<c:url value="/ui/images/jqgrid/ui-bg_inset-hard_100_fcfdfd_1x100.png" var="urlImgbgInsetHard"/>
<c:url value="/ui/images/jqgrid/ui-bg_flat_0_aaaaaa_40x100.png" var="urlImgbgFlat0"/>
<c:url value="/ui/images/jqgrid/ui-bg_gloss-wave_55_5c9ccc_500x100_red.png" var="urlImgbgGlossWave55"/>
<c:url value="/ui/images/jqgrid/ui-bg_glass_75_d0e5f5_1x400.png" var="urlImgbgGloss75"/>
<c:url value="/ui/images/jqgrid/ui-bg_flat_55_fbec88_40x100.png" var="urlImgbgFlat55"/>
<c:url value="/ui/images/jqgrid/ui-icons_d8e7f3_256x240.png" var="urlImgd8e7f3"/>


<!-- ******************** JS Declaration************************ -->

<c:url value="/ui/gen/js/jquery-1.10.1.min.js" var="urlJsJqueryMin"/>
<%-- <c:url value="/js/jquery-1.7.1.js" var="urlJsJqueryMin"/> --%>
<c:url value="/ui/bootstrap-3.1.1/dist/js/bootstrap.min.js" var="urlJsBootStrapMin"/>
<c:url value="/ui/gen/js/html5shiv.js" var="urlJsHtml5shiv"/>
<c:url value="/ui/gen/js/respond.min.js" var="urlJsRespond"/>
<c:url value="/ui/bootstrap-3.1.1/js/tooltip.js" var="urlJsBSToolTip"/>
<c:url value="/ui/bootstrap-3.1.1/js/popover.js" var="urlJsBSPopover"/>
<c:url value="/ui/bootstrap-3.1.1/js/tab.js" var="urlJsBSTab"/>
<c:url value="/ui/gen/js/jquery-ui.min.js" var="urlJsJqueryUIMin"/>
<c:url value="/ui/jqgrid-4.6.0/js/jquery.jqGrid.min.js" var="urlJsJqueryJqGrid"/>
<c:url value="/ui/jqgrid-4.6.0/js/i18n/grid.locale-en.js" var="urlJqGridLocaleEn"/>
<c:url value="/ui/jqgrid-4.6.0/js/i18n/grid.locale-ar.js" var="urlJqGridLocaleAr"/>

<c:url value="/ui/bootstrapvalidator-0.5.3/js/bootstrapValidator.min.js" var="urlJsValidatorBootStrap"/>

<!-- ******************** CSS implementation************************ --> 
 <link rel="stylesheet" type="text/css" href="${urlCssBootstrapMin}" />
 <link rel="stylesheet" type="text/css" href="${urlCssBootstrapThemeMin}" />
 <link rel="stylesheet" type="text/css" href="${urlCssNormalize}" />
 <link rel="stylesheet" type="text/css" href="${urlCssjqgrid}" />
 <link rel="stylesheet" type="text/css" href="${urlCssJQueryUiCustom}" />
 <link rel="stylesheet" type="text/css" href="${urlCssValidatorBootStrap}" />
<link rel="stylesheet" type="text/css" href="${urlCssAdminLTE}" />

<!-- ******************** JS implementation************************ --> 
 <script type="text/javascript" src="${urlJsJqueryMin}"></script>
 <script type="text/javascript" src="${urlJsBootStrapMin}"></script>
 <script type="text/javascript" src="${urlJsBSToolTip}"></script>
 <script type="text/javascript" src="${urlJsBSPopover}"></script>
 <script type="text/javascript" src="${urlJsJqueryUIMin}"></script>
 <script type="text/javascript" src="${urlJqGridLocaleEn}"></script>
 <script type="text/javascript" src="${urlJsJqueryJqGrid}"></script>


<script type="text/javascript" src="${urlJsValidatorBootStrap}"></script>


  
<%--  <script type="text/javascript" src="${urlJsBSTab}"></script> --%>
     <!--[if lt IE 9]>
      <script type="text/javascript" src="${urlJsHtml5shiv}"></script>
      <script type="text/javascript" src="${urlJsRespond}"></script>
    <![endif]-->
  