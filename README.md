Auto tests for erc20faucet.com
Сценарий теста:

1. Запустить страницу erc20faucet.com в браузере с установленым кошельком Metamask
2. Сменить сеть на Goerli
3. Законектить Metamask
4. Ввести сумму токенов которая будет отправлена на кошелек
5. нажать кнопку Mint Free Tokens
6. Подтвердить транзакцию в Metamask

Bonus points

Убедиться что баланс токенов увеличился на нужную сумму.
Для этого нужно через rpc вызвать метод balanceOf
у смарт контракта 0xBA62BCfcAaFc6622853cca2BE6Ac7d845BC0f2Dc
