const studentScores = [
    { name: "Alice", subject: "Math", score: 80 },
    { name: "Bob", subject: "Math", score: 55 },
    { name: "Charlie", subject: "Math", score: 75 },
    { name: "David", subject: "Math", score: 90 },
    { name: "Eva", subject: "Science", score: 70 },
    { name: "Frank", subject: "Science", score: 45 },
    { name: "Grace", subject: "Science", score: 85 },
    { name: "Hank", subject: "Science", score: 95 },
    { name: "Ivy", subject: "English", score: 60 },
    { name: "Jack", subject: "English", score: 50 },
    { name: "Kevin", subject: "English", score: 65 },
    { name: "Linda", subject: "English", score: 75 },
   ];


   
   const scoreLt60 = (stud) =>{
        return stud.filter( (stu) => 
        stu.score>=60
        )
   }

 

   // average score for each subject
   // first store the scores as array with subject as key

   //const subjMarks={}
   //console.log(subjMarks.hasOwnProperty("subject"))
   
   /*
   the below function gets an object with subject as keys containing array of marks scored
   {
    sub1:[1,2,3,4],
   }
   */
   const resarr = (studentMarks)=> {
    const subjMarks={}
    studentMarks.map(
    (stu) =>{
        // console.log(stu)
      if(subjMarks.hasOwnProperty(stu.subject)){
        subjMarks[stu.subject].push(stu.score)
      }
      else{
        subjMarks[stu.subject]=[]
        subjMarks[stu.subject].push(stu.score)
      }
    }
   )
   return subjMarks
}

    //resarr(studentScores)
   //console.log(subjMarks)

   /*
    resarr gives us all the scores of subject as array,
     use that to get the average in the below function.
     finalavg contains the subject as keys with their average
   */
   const avgScores =(studentMarks) =>{
        const res = resarr(studentMarks)
        // console.log(res)
        const finalAvg={}
        for(const subjm in res){
        //  console.log( res[subjm]) -> is an array of marks of subject->subjm
            const avgMarks = res[subjm].reduce((total, mark) => 
                    total+=mark
                ) / res[subjm].length ;
            // console.log(avgMarks)
            finalAvg[subjm] = avgMarks
        }
        return finalAvg
   }

   //console.log(avgScores(studentScores))

   // student who score highest in each subject
   /*
   store highest of each in the object resMax , using the resarr
   get the student from the student scores with the same score as in highest score for the subject
   */
   const highestStud =(studentMarks)=>{
        const res = resarr(studentMarks)
        const resMax={}
        for(const sub in res){
            resMax[sub] = Math.max(...res[sub])
        }
        // res max:
        /*
            resmax{
                subj1:100
                subj2:100
                subj3:100  ->max score
            }
        */
       // console.log(resMax)
        const topScoreres={}
        for(const stu of studentMarks){
           // console.log(stu,stu.subject,stu.mark)
            if(resMax[stu.subject]==stu.score){
                topScoreres[stu.name]=stu.score
            }
        }
        return topScoreres
   }

  

   //console.log(scoreLt60(studentScores))



   const display =(starr) =>{
       console.log(`students with scores above 60 : ${scoreLt60(starr)}`)
       console.log("students wth scores above and equal to 60")
       console.log(scoreLt60(starr))
       console.log("average scores of each subject")
       console.log(avgScores(starr))
       console.log(" student scoring the highest in each subjec")
       console.log(highestStud(starr))

   }

   display(studentScores)