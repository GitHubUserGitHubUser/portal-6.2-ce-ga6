/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.62
 * Generated at: 2020-02-27 15:17:46 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.html.js.editor.ckeditor;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.util.ContentTypes;
import com.liferay.portal.kernel.util.HtmlUtil;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.xuggler.XugglerUtil;
import java.util.Locale;

public final class ckconfig_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/tld/c.tld", Long.valueOf(1582809438000L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

String colorSchemeCssClass = ParamUtil.getString(request, "colorSchemeCssClass");

String contentsLanguageId = ParamUtil.getString(request, "contentsLanguageId");

Locale contentsLocale = LocaleUtil.fromLanguageId(contentsLanguageId);

contentsLanguageId = LocaleUtil.toLanguageId(contentsLocale);

String cssPath = ParamUtil.getString(request, "cssPath");
String cssClasses = ParamUtil.getString(request, "cssClasses");
boolean inlineEdit = ParamUtil.getBoolean(request, "inlineEdit");

String languageId = ParamUtil.getString(request, "languageId");

Locale locale = LocaleUtil.fromLanguageId(languageId);

languageId = LocaleUtil.toLanguageId(locale);

String name = ParamUtil.getString(request, "name");
boolean resizable = ParamUtil.getBoolean(request, "resizable");

response.setContentType(ContentTypes.TEXT_JAVASCRIPT);

      out.write("\n");
      out.write("\n");
      out.write(";window['");
      out.print( HtmlUtil.escapeJS(name) );
      out.write("Config'] = function() {\n");
      out.write("\tvar ckEditor = CKEDITOR.instances['");
      out.print( HtmlUtil.escapeJS(name) );
      out.write("'];\n");
      out.write("\n");
      out.write("\tif (!CKEDITOR.stylesSet.get('liferayStyles')) {\n");
      out.write("\t\tCKEDITOR.addStylesSet(\n");
      out.write("\t\t\t'liferayStyles',\n");
      out.write("\t\t\t[\n");
      out.write("\n");
      out.write("\t\t\t// Block Styles\n");
      out.write("\n");
      out.write("\t\t\t{name: 'Normal', element: 'p'},\n");
      out.write("\t\t\t{name: 'Heading 1', element: 'h1'},\n");
      out.write("\t\t\t{name: 'Heading 2', element: 'h2'},\n");
      out.write("\t\t\t{name: 'Heading 3', element: 'h3'},\n");
      out.write("\t\t\t{name: 'Heading 4', element: 'h4'},\n");
      out.write("\n");
      out.write("\t\t\t// Special classes\n");
      out.write("\n");
      out.write("\t\t\t{name: 'Preformatted Text', element:'pre'},\n");
      out.write("\t\t\t{name: 'Cited Work', element:'cite'},\n");
      out.write("\t\t\t{name: 'Computer Code', element:'code'},\n");
      out.write("\n");
      out.write("\t\t\t// Custom styles\n");
      out.write("\n");
      out.write("\t\t\t{name: 'Info Message', element: 'div', attributes: {'class': 'portlet-msg-info'}},\n");
      out.write("\t\t\t{name: 'Alert Message', element: 'div', attributes: {'class': 'portlet-msg-alert'}},\n");
      out.write("\t\t\t{name: 'Error Message', element: 'div', attributes: {'class': 'portlet-msg-error'}}\n");
      out.write("\t\t\t]\n");
      out.write("\t\t);\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\tvar config = ckEditor.config;\n");
      out.write("\n");
      out.write("\tconfig.autoParagraph = false;\n");
      out.write("\n");
      out.write("\tconfig.autoSaveTimeout = 3000;\n");
      out.write("\n");
      out.write("\tconfig.bodyClass = 'html-editor ");
      out.print( HtmlUtil.escapeJS(colorSchemeCssClass) );
      out.write(' ');
      out.print( HtmlUtil.escapeJS(cssClasses) );
      out.write("';\n");
      out.write("\n");
      out.write("\tconfig.closeNoticeTimeout = 8000;\n");
      out.write("\n");
      out.write("\tconfig.contentsCss = ['");
      out.print( HtmlUtil.escapeJS(cssPath) );
      out.write("/aui.css', '");
      out.print( HtmlUtil.escapeJS(cssPath) );
      out.write("/main.css'];\n");
      out.write("\n");

String contentsLanguageDir = LanguageUtil.get(contentsLocale, "lang.dir");

      out.write("\n");
      out.write("\n");
      out.write("\tconfig.contentsLangDirection = '");
      out.print( HtmlUtil.escapeJS(contentsLanguageDir) );
      out.write("';\n");
      out.write("\n");
      out.write("\tconfig.contentsLanguage = '");
      out.print( contentsLanguageId.replace("iw_", "he_") );
      out.write("';\n");
      out.write("\n");
      out.write("\tconfig.entities = false;\n");
      out.write("\n");
      out.write("\tconfig.extraPlugins = 'a11yhelpbtn,media,scayt,wsc';\n");
      out.write("\n");
      out.write("\t");
      //  c:if
      com.liferay.taglib.core.IfTag _jspx_th_c_005fif_005f0 = (com.liferay.taglib.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(com.liferay.taglib.core.IfTag.class);
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /html/js/editor/ckeditor/ckconfig.jsp(108,1) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest( inlineEdit );
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write("\n");
        out.write("\t\tconfig.extraPlugins += ',ajaxsave,restore';\n");
        out.write("\t");
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      out.write("\n");
      out.write("\n");
      out.write("\tconfig.height = 265;\n");
      out.write("\n");
      out.write("\tconfig.language = '");
      out.print( languageId.replace("iw_", "he_") );
      out.write("';\n");
      out.write("\n");
      out.write("\tconfig.pasteFromWordRemoveFontStyles = false;\n");
      out.write("\n");
      out.write("\tconfig.pasteFromWordRemoveStyles = false;\n");
      out.write("\n");
      out.write("\tconfig.resize_enabled = ");
      out.print( resizable );
      out.write(";\n");
      out.write("\n");
      out.write("\t");
      //  c:if
      com.liferay.taglib.core.IfTag _jspx_th_c_005fif_005f1 = (com.liferay.taglib.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(com.liferay.taglib.core.IfTag.class);
      _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f1.setParent(null);
      // /html/js/editor/ckeditor/ckconfig.jsp(122,1) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f1.setTest( resizable );
      int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
      if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write("\n");
        out.write("\t\tconfig.resize_dir = 'vertical';\n");
        out.write("\t");
      }
      if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
        return;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      out.write("\n");
      out.write("\n");
      out.write("\tconfig.stylesCombo_stylesSet = 'liferayStyles';\n");
      out.write("\n");
      out.write("\tconfig.title = false;\n");
      out.write("\n");
      out.write("\tconfig.toolbar_editInPlace = [\n");
      out.write("\t\t['Styles'],\n");
      out.write("\t\t['Bold', 'Italic', 'Underline', 'Strike'],\n");
      out.write("\t\t['Subscript', 'Superscript', 'SpecialChar'],\n");
      out.write("\t\t['Undo', 'Redo'],\n");
      out.write("\t\t['SpellChecker', 'Scayt'],\n");
      out.write("\t\t['NumberedList', 'BulletedList', '-', 'Outdent', 'Indent'], ['Source', 'RemoveFormat'],\n");
      out.write("\t\t['A11YBtn']\n");
      out.write("\t];\n");
      out.write("\n");
      out.write("\tconfig.toolbar_email = [\n");
      out.write("\t\t['FontSize', 'TextColor', 'BGColor', '-', 'Bold', 'Italic', 'Underline', 'Strike'],\n");
      out.write("\t\t['JustifyLeft', 'JustifyCenter', 'JustifyRight', 'JustifyBlock'],\n");
      out.write("\t\t['SpellChecker', 'Scayt'],\n");
      out.write("\t\t'/',\n");
      out.write("\t\t['Undo', 'Redo', '-', 'Cut', 'Copy', 'Paste', 'PasteText', 'PasteFromWord', '-', 'SelectAll', 'RemoveFormat'],\n");
      out.write("\t\t['Source'],\n");
      out.write("\t\t['Link', 'Unlink'],\n");
      out.write("\t\t['Image'],\n");
      out.write("\t\t['A11YBtn']\n");
      out.write("\t];\n");
      out.write("\n");
      out.write("\tconfig.toolbar_liferay = [\n");
      out.write("\t\t['Bold', 'Italic', 'Underline', 'Strike'],\n");
      out.write("\n");
      out.write("\t\t");
      //  c:if
      com.liferay.taglib.core.IfTag _jspx_th_c_005fif_005f2 = (com.liferay.taglib.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(com.liferay.taglib.core.IfTag.class);
      _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f2.setParent(null);
      // /html/js/editor/ckeditor/ckconfig.jsp(155,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f2.setTest( inlineEdit );
      int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
      if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write("\n");
        out.write("\t\t\t['AjaxSave', '-', 'Restore'],\n");
        out.write("\t\t");
      }
      if (_jspx_th_c_005fif_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
        return;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
      out.write("\n");
      out.write("\n");
      out.write("\t\t['Undo', 'Redo', '-', 'Cut', 'Copy', 'Paste', 'PasteText', 'PasteFromWord'],\n");
      out.write("\t\t['Styles', 'FontSize', '-', 'TextColor', 'BGColor'],\n");
      out.write("\t\t'/',\n");
      out.write("\t\t['NumberedList', 'BulletedList', '-', 'Outdent', 'Indent'],\n");
      out.write("\t\t['JustifyLeft', 'JustifyCenter', 'JustifyRight', 'JustifyBlock'],\n");
      out.write("\t\t['Image', 'Link', 'Unlink', 'Anchor'],\n");
      out.write("\t\t['Flash', ");
      //  c:if
      com.liferay.taglib.core.IfTag _jspx_th_c_005fif_005f3 = (com.liferay.taglib.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(com.liferay.taglib.core.IfTag.class);
      _jspx_th_c_005fif_005f3.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f3.setParent(null);
      // /html/js/editor/ckeditor/ckconfig.jsp(165,12) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f3.setTest( XugglerUtil.isEnabled() );
      int _jspx_eval_c_005fif_005f3 = _jspx_th_c_005fif_005f3.doStartTag();
      if (_jspx_eval_c_005fif_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write(" 'Audio', 'Video',");
      }
      if (_jspx_th_c_005fif_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f3);
        return;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f3);
      out.write(" 'Table', '-', 'Smiley', 'SpecialChar'],\n");
      out.write("\t\t['Find', 'Replace', 'SpellChecker', 'Scayt'],\n");
      out.write("\t\t['SelectAll', 'RemoveFormat'],\n");
      out.write("\t\t['Subscript', 'Superscript']\n");
      out.write("\n");
      out.write("\t\t");
      //  c:if
      com.liferay.taglib.core.IfTag _jspx_th_c_005fif_005f4 = (com.liferay.taglib.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(com.liferay.taglib.core.IfTag.class);
      _jspx_th_c_005fif_005f4.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f4.setParent(null);
      // /html/js/editor/ckeditor/ckconfig.jsp(170,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f4.setTest( !inlineEdit );
      int _jspx_eval_c_005fif_005f4 = _jspx_th_c_005fif_005f4.doStartTag();
      if (_jspx_eval_c_005fif_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write("\n");
        out.write("\t\t\t,['Source']\n");
        out.write("\t\t");
      }
      if (_jspx_th_c_005fif_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f4);
        return;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f4);
      out.write("\n");
      out.write("\n");
      out.write("\t\t,['A11YBtn']\n");
      out.write("\t];\n");
      out.write("\n");
      out.write("\tconfig.toolbar_liferayArticle = [\n");
      out.write("\t\t['Styles', 'FontSize', '-', 'TextColor', 'BGColor'],\n");
      out.write("\t\t['Bold', 'Italic', 'Underline', 'Strike'],\n");
      out.write("\t\t['Subscript', 'Superscript'],\n");
      out.write("\t\t'/',\n");
      out.write("\t\t['Undo', 'Redo', '-', 'Cut', 'Copy', 'Paste', 'PasteText', 'PasteFromWord', '-', 'SelectAll', 'RemoveFormat'],\n");
      out.write("\t\t['Find', 'Replace', 'SpellChecker', 'Scayt'],\n");
      out.write("\t\t['NumberedList','BulletedList','-','Outdent','Indent','Blockquote'],\n");
      out.write("\t\t['JustifyLeft', 'JustifyCenter', 'JustifyRight', 'JustifyBlock'],\n");
      out.write("\t\t'/',\n");
      out.write("\t\t['Source'],\n");
      out.write("\t\t['Link', 'Unlink', 'Anchor'],\n");
      out.write("\t\t['Image', 'Flash', ");
      //  c:if
      com.liferay.taglib.core.IfTag _jspx_th_c_005fif_005f5 = (com.liferay.taglib.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(com.liferay.taglib.core.IfTag.class);
      _jspx_th_c_005fif_005f5.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f5.setParent(null);
      // /html/js/editor/ckeditor/ckconfig.jsp(189,21) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f5.setTest( XugglerUtil.isEnabled() );
      int _jspx_eval_c_005fif_005f5 = _jspx_th_c_005fif_005f5.doStartTag();
      if (_jspx_eval_c_005fif_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write("'Audio', 'Video',");
      }
      if (_jspx_th_c_005fif_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f5);
        return;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f5);
      out.write(" 'Table', '-', 'Smiley', 'SpecialChar', 'LiferayPageBreak'],\n");
      out.write("\t\t['A11YBtn']\n");
      out.write("\t];\n");
      out.write("\n");
      out.write("\tconfig.toolbar_phone = [\n");
      out.write("\t\t['Bold', 'Italic', 'Underline'],\n");
      out.write("\t\t['NumberedList', 'BulletedList'],\n");
      out.write("\t\t['Image', 'Link', 'Unlink']\n");
      out.write("\t];\n");
      out.write("\n");
      out.write("\tconfig.toolbar_simple = [\n");
      out.write("\t\t['Bold', 'Italic', 'Underline', 'Strike'],\n");
      out.write("\t\t['NumberedList', 'BulletedList'],\n");
      out.write("\t\t[ 'Link', 'Unlink']\n");
      out.write("\t];\n");
      out.write("\n");
      out.write("\tconfig.toolbar_tablet = [\n");
      out.write("\t\t['Bold', 'Italic', 'Underline', 'Strike'],\n");
      out.write("\t\t['NumberedList', 'BulletedList'],\n");
      out.write("\t\t['Image', 'Link', 'Unlink'],\n");
      out.write("\t\t['JustifyLeft', 'JustifyCenter', 'JustifyRight', 'JustifyBlock'],\n");
      out.write("\t\t['Styles', 'FontSize']\n");
      out.write("\t];\n");
      out.write("\n");
      out.write("\tCKEDITOR.on(\n");
      out.write("\t\t'dialogDefinition',\n");
      out.write("\t\tfunction(event) {\n");
      out.write("\t\t\tvar dialogDefinition = event.data.definition;\n");
      out.write("\n");
      out.write("\t\t\tvar onShow = dialogDefinition.onShow;\n");
      out.write("\n");
      out.write("\t\t\tdialogDefinition.onShow = function() {\n");
      out.write("\t\t\t\tif (typeof onShow === 'function') {\n");
      out.write("\t\t\t\t\tonShow.apply(this, arguments);\n");
      out.write("\t\t\t\t}\n");
      out.write("\n");
      out.write("\t\t\t\tif (window.top != window.self) {\n");
      out.write("\t\t\t\t\tvar editorElement = this.getParentEditor().container;\n");
      out.write("\n");
      out.write("\t\t\t\t\tvar documentPosition = editorElement.getDocumentPosition();\n");
      out.write("\n");
      out.write("\t\t\t\t\tvar dialogSize = this.getSize();\n");
      out.write("\n");
      out.write("\t\t\t\t\tvar x = documentPosition.x + ((editorElement.getSize('width', true) - dialogSize.width) / 2);\n");
      out.write("\t\t\t\t\tvar y = documentPosition.y + ((editorElement.getSize('height', true) - dialogSize.height) / 2);\n");
      out.write("\n");
      out.write("\t\t\t\t\tthis.move(x, y, false);\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t}\n");
      out.write("\t\t}\n");
      out.write("\t);\n");
      out.write("};\n");
      out.write("\n");
      out.write("window['");
      out.print( HtmlUtil.escapeJS(name) );
      out.write("Config']();\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
