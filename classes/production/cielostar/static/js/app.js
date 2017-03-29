var app = angular.module('cielostar', ['ngRoute','ngResource']);

app.config(function($routeProvider){

    $routeProvider
        .when('/',{
            templateUrl: '/views/lista.html',
            controller: 'listaController'})
        .otherwise( { redirectTo: '/'});
});
