<#import "main.ftlh" as main />

<@main.renderWith>
    <h2>Пожалуйста, войдите в систему</h2>
    <form action="/login" method="post">

        <div>
            <#if error!false >
                <p style="color:red">Неверные имя пользователя или пароль !</p>
            </#if>
        </div>

        <#if _csrf??>
            <input type="hidden" name="${(_csrf.parameterName)!'csrf'}" value="${(_csrf.token)!'--no-token--'}"/>
        </#if>

        <div>
            <label class="flex flex-v-center">
                <p class="label-input-text">Введите ваш email:</p>
                <input type="text" name="email" placeholder="Ваш email"  value="${(dto.email)!''}" autofocus>
            </label>
        </div>
        <hr>
        <div>
            <label class="flex flex-v-center">
                <p class="label-input-text">Пароль:</p>
                <input type="password" name="password" placeholder="Ваш пароль"  value="">
            </label>
        </div>
        <hr>
        <div>
            <button type="submit" value="${(dto.email)!''}">Войти!</button>
        </div>

        <#if _csrf??>
            <input type="hidden" name="${(_csrf.parameterName)!'csrf'}" value="${(_csrf.token)!'--no-token--'}"/>
        </#if>
    </form>
    <hr>
    <div class="bottom-box">
        <a href="/">На главную страницу</a>
    </div>
</@main.renderWith>
