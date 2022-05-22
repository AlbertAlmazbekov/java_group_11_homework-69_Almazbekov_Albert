<#import "main.ftlh" as main />

<@main.renderWith>

    <h2>Пожалуйста, зарегистрируйтесь</h2>
    <div>
        <form action="/register" method="post">

            <#if _csrf??>
                <input type="hidden" name="${(_csrf.parameterName)!'csrf'}" value="${(_csrf.token)!'--no-token--'}"/>
            </#if>

            <div>
                <label class="flex flex-v-center">
                    <p class="label-input-text">Введите ваше имя:</p>
                    <input type="text" name="name" placeholder="Ваше имя"  value="${(dto.name)!''}">
                </label>
            </div>
            <hr>
            <div>
                <label class="flex flex-v-center">
                    <p class="label-input-text">Введите ваш email:</p>
                    <input type="text" name="email" placeholder="Ваш email"  value="${(dto.email)!''}" >
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
                <button type="submit">Регистрация</button>
            </div>
            <div>
                <#if errors?? >
                    <p>Входные данные с ошибками!</p>
                    <#list errors as fieldError>
                        <p>${fieldError.field} - ${fieldError.defaultMessage!'-- no message --'}</p>
                    </#list>
                </#if>
            </div>
        </form>
    </div>
    <div class="bottom-box">
        <a href="/">На главную страницу</a>
    </div>
</@main.renderWith>