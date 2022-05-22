<form id="search_form" method="get" action="http://localhost:8011/tovar/search">
    Search: <input name="pattern" value="${pattern}"/>
    <input type="submit" value="Find">
</form>

<#list tovars as tovar>
    <div>${tovar}</div>
</#list>

<#if tovars?has_content>

    <a href="http://localhost:8011/tovar/search?pattern=${pattern}&page=0&size=3">1</a>

</#if>
