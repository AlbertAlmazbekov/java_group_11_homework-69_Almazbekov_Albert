<#import "main.ftlh" as main />

<@main.renderWith>

</@main.renderWith>

<table class="table table-dark table-striped">
    <form action="/order/quantity" method="post" id="quantity_form">
        <#if _csrf??>
            <input type="hidden" name="${(_csrf.parameterName)!'csrf'}"
                   value="${(_csrf.token)!'--no-token--'}"/>
        </#if>
        <thead>
        <tr>
            <th scope="col">Name</th>
<#--            <th scope="col">Price</th>-->
<#--            <th scope="col">Quantity <input type="submit" value="Update" class="update" id="update"></th>-->
<#--            <th scope="col">Action</th>-->
        </tr>
        </thead>
        <tbody>
        <#list cartItems as item>
        <tr>
            <td>${item.novar.name}</td>
<#--            <td>${item.product.price}</td>-->
            <td><input type="number" name="quantity" min="1" max="10" value="${item.quantity}" class="quantity"
                /></td>
    </form>
    <td>
        <form action="/cart/delete/${item.id}" id="delete_form" method="post">
            <#if _csrf??>
                <input type="hidden" name="${(_csrf.parameterName)!'csrf'}"
                       value="${(_csrf.token)!'--no-token--'}"/>
            </#if>
            <input type="text" name="taskId" value="${item.id}" hidden>
            <input type="submit" value="Delete" class="delete">
        </form>
    </td>
    </tr>
    </#list>
    </tbody>
</table>
<a href="/">Назад к товарам</a>


<div class="card border-primary mb-3" style="max-width: 18rem;">
    <div class="card-header">Totals</div>
    <table class="table">
        <tbody>
        <tr>
            <th>TotalSum</th>
            <td>${sum}</td>
        </tr>
        </tbody>
    </table>
    <form action="/order" method="post">
        <button type="submit" class="btn btn-dark">Оформить заказ</button>
    </form>
</div>