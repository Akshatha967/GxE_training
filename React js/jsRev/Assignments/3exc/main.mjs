import student from "./student.mjs";

const stuAgrade = student.filter((item) => item.grade=='A')
stuAgrade.forEach(stu=>
    console.log(stu.name, stu.age)
)

