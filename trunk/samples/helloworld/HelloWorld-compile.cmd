if not "%GWT_HOME%" == "" goto checkSmart
echo Set the environment variable GWT_HOME to point to you GWT root directory.
goto end

:checkSmart
if not "%SMART_GWT_HOME%" == "" goto compile
echo Set the environment variable SMART_GWT_HOME to point to you SmartGWT root directory.
goto end

:compile
@java -Xmx500M -cp "%~dp0\src;%~dp0\bin;%GWT_HOME%/gwt-user.jar;%GWT_HOME%/gwt-dev-windows.jar;%SMART_GWT_HOME%/smartgwt.jar" com.google.gwt.dev.GWTCompiler -out "%~dp0\www" %* com.mycompany.HelloWorld

:end