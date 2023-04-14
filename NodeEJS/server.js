const express = require('express')
const app = express()
const port = 3000

app.set("view engine", "ejs")

app.get("/", function(req, res) {
    const items = [
        {
            title : "A", 
            message : "aprendendo Desenvolver Aplicações"
        },
        {
            title : "B",
            message : "Bootstrap com EJS"
        },
        {
            title: "C",
            message: "Criando pacotes"
        },
        {
            title: "D",
            message: "Direcionando EJS com servidor"
        }
    ];

    const subtitle = "Uma linguagem de modelagem para criação de página HTML"
    res.render("pages/index", {
        create: items,
        subtitle: subtitle,
    })
})


app.get("/sobre", function(req, res) {
    res.render("pages/about")
})

app.listen(port)
console.log(`Rodando na porta ${port}!!!`)