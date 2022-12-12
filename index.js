const express = require("Express")
const app = express()

const PORT = 4000
app.get("/", (req,res)=>{
res.status(200)
})

app.listening(PORT. console.("server running"))

